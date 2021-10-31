package com.company2;

import java.math.BigDecimal;
import java.util.Comparator;

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

    public static Comparator<Student> getComparatorByName() {
        return new ComparatorByName();
    }

    public static Comparator<Student> getComparatorByAge() {
        return new ComparatorByAge();
    }

    public static Comparator<Student> getComparatorByNameAndAge() {
        return new ComparatorByNameAndAge();
    }

    public static class ComparatorByName implements Comparator<Student> {
        @Override
        public int compare(Student firstStudent, Student secondStudent) {
            return firstStudent.getName().compareTo(secondStudent.getName());
        }
    }

    public static class ComparatorByAge implements Comparator<Student> {
        @Override
        public int compare(Student firstStudent, Student secondStudent) {
            return Integer.compare(firstStudent.getAge(), (secondStudent.getAge()));
        }
    }

    public static class ComparatorByNameAndAge implements Comparator<Student> {
        @Override
        public int compare(Student firstStudent, Student secondStudent) {
            if (firstStudent.getName().compareTo(secondStudent.getName()) != 0) {
                return Integer.compare(firstStudent.getAge(), (secondStudent.getAge()));
            }
            else if (firstStudent.getName().compareTo(secondStudent.getName()) < 0) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
    public static Comparator <Student> anonymousComparatorOne() {
        Comparator<Student> comparatorOne = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                return firstStudent.getName().compareTo(secondStudent.getName());
            }
        };
        return comparatorOne;
    }

    public static Comparator<Student> anonymousComparatorTwo() {
        Comparator<Student> comparatorTwo = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
            }
        };
        return comparatorTwo;
    }

    public static Comparator<Student> anonymousComparatorThree() {
        Comparator<Student> comparatorThree = new Comparator<>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                if (firstStudent.getName().compareTo(secondStudent.getName()) != 0) {
                    return Integer.compare(firstStudent.getAge(), (secondStudent.getAge()));
                }
                else if (firstStudent.getName().compareTo(secondStudent.getName()) < 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };
        return comparatorThree;
    }
}
