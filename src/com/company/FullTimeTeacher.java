package com.company;

public class FullTimeTeacher extends Teacher {
    private double salaryBase;
    private final static double taxPercent = 0.07;
    private final static double insurancePercent = 0.03;

    public FullTimeTeacher(String name, int age, Degree degree, double salaryBase) {
        super(name, age, degree);
        this.salaryBase = salaryBase;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    @Override
    public Double calculateSalary() {
        double tax = salaryBase * taxPercent;
        double insurance = salaryBase * insurancePercent;
        double salary = salaryBase - tax - insurance;
        switch (getDegree()) {
            case MA:
                salary += salary * (0.12);
                break;
            case BACHELOR:
                salary += salary * (0.1);
                break;
            case DOCTORATE:
                salary += salary * (0.15);
                break;
        }
        return salary;
    }
}
