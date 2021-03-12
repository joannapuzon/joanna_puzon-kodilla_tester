package com.kodilla.abstracts.homework;

public class Cashier extends Job{
    int salary;
    String responsibilities;

    public Cashier(int salary, String responsibility) {
        this.salary = salary;
        this.responsibilities = responsibility;
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
