package com.kodilla.abstracts.homework;

public class Driver extends Job{
    int salary;
    String responsibilities;

    public Driver(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}