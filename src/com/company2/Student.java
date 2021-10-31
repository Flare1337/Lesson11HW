package com.company2;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int age;
    private BigDecimal salary;

    public Student(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("name=%s\nage=%d\nsalary=%f ", name, age, salary);
    }
}
