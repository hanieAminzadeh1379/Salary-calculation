package com.company;

public class Teacher {
    private String name;
    private int age;
    private Degree degree;

    public Teacher(String name, int age, Degree degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
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

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Double calculateSalary() {
        return null;
    }
}
