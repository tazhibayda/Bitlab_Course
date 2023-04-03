package com.example.Entity;

public class Person {
    String Name;
    String Surname;
    String Department;
    int Salary;

    public Person(String name, String surname, String department, int salary) {
        Name = name;
        Surname = surname;
        Department = department;
        Salary = salary;
    }
    public Person(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
