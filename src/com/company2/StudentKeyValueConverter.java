package com.company2;

public class StudentKeyValueConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name=").append(student.getName()).append("\n");
        stringBuilder.append("age=").append(student.getAge()).append("\n");
        stringBuilder.append("salary=").append(student.getSalary()).append("\n");
        return stringBuilder.toString();
    }
}
