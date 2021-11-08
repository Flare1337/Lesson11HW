package com.company2;

public class StudentToStringPrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public StudentToStringPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        converter.convert(student);
    }
}
