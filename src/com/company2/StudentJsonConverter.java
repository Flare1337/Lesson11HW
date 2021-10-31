package com.company2;

public class StudentJsonConverter implements IStudentStringConverter {

    @Override
    public String convert(Student student) {
        IStudentStringConverter studentStringConverter = new IStudentStringConverter() {
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
        return studentStringConverter.convert(student);
    }
}
