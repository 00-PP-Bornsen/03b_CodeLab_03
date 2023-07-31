package com.cc.java;

import java.time.LocalDate;


class Employee {
    private String firstName;
    private String familyName;
    private int birthYear;
    private int workID;
    private String department;
    private String role;
    private int hiredYear;

    public Employee(String firstName, String familyName, int birthYear, int workID, String department, String role, int hiredYear) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
        this.hiredYear = hiredYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return familyName;
    }

    public void setLastName(String familyName) {
        this.familyName = familyName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getEmployeeNumber() {
        return workID;
    }

    public void setEmployeeNumber(int workID) {
        this.workID = workID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }

    public int getHiredYear() {
        return hiredYear;
    }

    public void setHiredYear(int hiredYear) {
        this.hiredYear = hiredYear;
    }

    public void hasLunch() {
        System.out.println("Hi, I'm " + firstName + " and I'm having lunch!");
    }

    public void startsWork() {
        System.out.println("Hi, I'm " + firstName + " and I'm starting my work at the " + department + " department!");
    }

    public void getEmployedTime() {
        int currentYear = LocalDate.now().getYear();
        int yearsEmployed = currentYear - hiredYear;
        System.out.println("Hi, I'm " + firstName + " and I've been working here since " + yearsEmployed + " years.");
    }

    public void doYourJob() {
        if (department.equals("Accounting")) {
            callsCustomer();
        } else if (department.equals("Manufacturing")) {
            doManufacturingJob();
        } else if (department.equals("Advertising")) {
            doAdvertisingJob();
        } else {
            System.out.println("Hi, I'm " + firstName + " and I'm doing my regular job.");
        }
    }

    private void callsCustomer() {
        System.out.println("Hi, I'm " + firstName + " and I'm calling a customer in the Accounting department!");
    }

    private void doManufacturingJob() {
        System.out.println("Hi, I'm " + firstName + " and I'm working in the Manufacturing department!");
    }

    private void doAdvertisingJob() {
        System.out.println("Hi, I'm " + firstName + " and I'm working in the Advertising department!");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Max", "Maxer", 1985, 1001, "Accounting", "Accountant", 2018);
        Employee employee2 = new Employee("John", "Wick", 1990, 2001, "Manufacturing", "Engineer", 2015);
        Employee employee3 = new Employee("Xi", "Wang", 1988, 3001, "Advertising", "Marketing Specialist", 2019);

        employee1.hasLunch();
        employee1.startsWork();
        employee1.getEmployedTime();
        employee1.doYourJob();

        employee2.hasLunch();
        employee2.startsWork();
        employee2.getEmployedTime();
        employee2.doYourJob();

        employee3.hasLunch();
        employee3.startsWork();
        employee3.getEmployedTime();
        employee3.doYourJob();
    }
}
