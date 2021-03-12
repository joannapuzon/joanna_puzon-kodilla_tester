package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfMade;

    public OperatingSystem(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public void turnOn() {
        System.out.println("Turning on...");
    }

    public int getYearOfMade() {
        return yearOfMade;
    }
}