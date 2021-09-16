package com.company;

public class PartTimeTeacher extends Teacher {

    private double workHoure;
    private double hourlyWages;

    public PartTimeTeacher(String name, int age, Degree degree, double workHoure, double hourlyWages) {
        super(name, age, degree);
        this.workHoure = workHoure;
        this.hourlyWages = hourlyWages;
    }

    public double getWorkHoure() {
        return workHoure;
    }

    public void setWorkHoure(double workHoure) {
        this.workHoure = workHoure;
    }

    public double getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(double hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    @Override
    public Double calculateSalary() {
        double salary = workHoure * hourlyWages;
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
