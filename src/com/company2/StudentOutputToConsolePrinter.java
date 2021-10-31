package com.company2;

public class StudentOutputToConsolePrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public StudentOutputToConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        System.out.println(converter.convert(student).toString());
    }

    @Override
    public void print(String student) {
        System.out.println("OutputToConsole! " + student);
    }
}
