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

        var result4 = Student.anonymousComparatorOne().compare(student1, student2);
        System.out.println(result4);
        var result5 = Student.anonymousComparatorTwo().compare(student1, student2);
        System.out.println(result5);
        var result6 = Student.anonymousComparatorThree().compare(student1, student2);
        System.out.println(result6);
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

        IStudentStringConverter studentStringConverterOne = new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("{").append("\n");
                stringBuilder.append("\t").append("\"name\":").append("\"" + student.getName() + "\",").append("\n");
                stringBuilder.append("\t").append("\"age\":").append(student.getAge() + ",").append("\n");
                stringBuilder.append("\t").append("\"salary\":").append(student.getSalary()).append("\n");
                stringBuilder.append("}");
                return stringBuilder.toString();
            }
        };
        IStudentStringConverter studentStringConverterTwo = new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("name=").append(student.getName()).append("\n");
                stringBuilder.append("age=").append(student.getAge()).append("\n");
                stringBuilder.append("salary=").append(student.getSalary()).append("\n");
                return stringBuilder.toString();
            }
        };
        IStudentStringConverter studentStringConverterThree = new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<student>").append("\n");
                stringBuilder.append("\t").append("<name>").append(student.getName()).append("</name>\n");
                stringBuilder.append("\t").append("<age>").append(student.getAge()).append("</age>\n");
                stringBuilder.append("\t").append("<salary>").append(student.getSalary()).append("</salary>\n");
                stringBuilder.append("</student>");
                return stringBuilder.toString();
            }
        };
        IStudentPrinter studentPrinterPrint = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                System.out.println(student.toString());
            }
        };
        IStudentPrinter studentPrinterNoAction = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                student.toString();
            }
        };
        IStudentPrinter studentPrinterDelegate = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                for (IStudentPrinter printer : printers) {
                    printer.print(student);
                }
            }
        };
        studentStringConverterOne.convert(student);
        studentStringConverterTwo.convert(student);
        studentStringConverterThree.convert(student);

        studentPrinterPrint.print(student);
        studentPrinterNoAction.print(student);
        studentPrinterDelegate.print(student);
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
