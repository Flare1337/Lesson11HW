package com.company2;

public class StudentToStringPrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public StudentToStringPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    // В задании указано что мы в любом случае в любом случае превращаем студента в строку
    // так что, превращаем переопределенным методом а остальное как описано в ТЗ, ничего не делаем
    @Override
    public void print(Student student) {
        converter.convert(student);
    }

}
