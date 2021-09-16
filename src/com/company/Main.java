package com.company;

public class Main {

    public static void main(String[] args) {
        FullTimeTeacher fullTimeTeacher=new FullTimeTeacher("ALI",32,Degree.DOCTORATE,5000000);
        PartTimeTeacher partTimeTeacher=new PartTimeTeacher("SAHAR",25,Degree.MA,7,20000);
        System.out.println("salary= "+fullTimeTeacher.calculateSalary());
        System.out.println("salary= "+partTimeTeacher.calculateSalary());
        System.out.println();
    }

}