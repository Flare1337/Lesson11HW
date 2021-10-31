package com.company2;

public class StudentToStringPrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public StudentToStringPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        IStudentPrinter studentPrinter = new IStudentPrinter() {
            @Override
            public void print(Student student) {
                student.toString();
            }
        };
        studentPrinter.print(student);
    }
}
