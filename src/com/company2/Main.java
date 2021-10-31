package com.company2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // write your code here

        new Main().processTheTaskData();

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
