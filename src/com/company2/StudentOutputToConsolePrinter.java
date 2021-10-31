package com.company2;

public class StudentOutputToConsolePrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public StudentOutputToConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        IStudentPrinter studentPrinter = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                System.out.println(student.toString());
            }
        };
        studentPrinter.print(student);
    }
}
