package com.company2;

public class StudentXmlConverter implements IStudentStringConverter {
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
}
