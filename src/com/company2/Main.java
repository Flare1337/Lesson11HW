package com.company2;

import java.math.BigDecimal;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main().processTheTaskData();
        Student student1 = new Student("Josh",12, new BigDecimal("23.5"));
        Student student2 = new Student("Mary", 21 , new BigDecimal("3.14"));

        Student.ComparatorByName byName = new Student.ComparatorByName();
        Student.ComparatorByAge byAge = new Student.ComparatorByAge();
        Student.ComparatorByNameAndAge byNameAndAge = new Student.ComparatorByNameAndAge();
        var result1 = byName.compare(student1, student2);
        var result2 = byAge.compare(student1, student2);
        var result3 = byNameAndAge.compare(student1, student2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        Comparator<Student> comparatorOne = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                return (firstStudent.getName().compareTo(secondStudent.getName()));
            }
        };
        var result4 = comparatorOne.compare(student1, student2);
        System.out.println(result4);
        Comparator<Student> comparatorTwo = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
            }
        };
        var result5 = comparatorTwo.compare(student1, student2);
        System.out.println(result5);
        Comparator<Student> comparatorThree = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                if (firstStudent.getName().compareTo(secondStudent.getName()) != 0) {
                    return Integer.compare(firstStudent.getAge(), (secondStudent.getAge()));
                }
                else if (firstStudent.getName().compareTo(secondStudent.getName()) < 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };
        var result6 = comparatorThree.compare(student1, student2);
        System.out.println(result6);

        IStudentStringConverter studentStringConverter = new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("name=").append(student.getName()).append("\n");
                stringBuilder.append("age=").append(student.getAge()).append("\n");
                stringBuilder.append("salary=").append(student.getSalary()).append("\n");
                return stringBuilder.toString();
            }
        };
        IStudentPrinter studentPrinter = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                System.out.println(student.toString());
            }
        };
        System.out.println(studentStringConverter.convert(student1));
        studentPrinter.print(student1);
    }
    private void processTheTaskData() {
        Student student = new Student("Josh",12, new BigDecimal("23.5"));
        Student student1 = (new Student("Mary", 21 , new BigDecimal("3.14")));
        StudentToStringPrinter toStringPrinter1 = new StudentToStringPrinter(randomConverter());
        StudentToStringPrinter toStringPrinter2 = new StudentToStringPrinter(randomConverter());
        StudentToStringPrinter toStringPrinter3 = new StudentToStringPrinter(randomConverter());
        StudentOutputToConsolePrinter outputToConsolePrinter1 = new StudentOutputToConsolePrinter(randomConverter());
        StudentOutputToConsolePrinter outputToConsolePrinter2 = new StudentOutputToConsolePrinter(randomConverter());
        IStudentPrinter[] printers = new IStudentPrinter[5];
        printers[0] = toStringPrinter1;
        printers[1] = toStringPrinter2;
        printers[2] = toStringPrinter3;
        printers[3] = outputToConsolePrinter1;
        printers[4] = outputToConsolePrinter2;

        toStringPrinter1.print(student);
        outputToConsolePrinter1.print(student1);

        IStudentPrinter studentStringConverter = new DelegatingStudentPrinter(printers);
        studentStringConverter.print(student);
    }

    private IStudentStringConverter randomConverter() {
        double random = Math.random();
        if (random > 0.8) {
            return new StudentJsonConverter();
        }
        else if (random > 0.4) {
            return new StudentXmlConverter();
        }
        else {
            return new StudentKeyValueConverter();
        }
    }
}
