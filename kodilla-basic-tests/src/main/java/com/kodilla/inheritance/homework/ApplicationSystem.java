package com.kodilla.inheritance.homework;

public class ApplicationSystem extends OperatingSystem {

    public ApplicationSystem(int yearOfMade) {
        super(yearOfMade);
        System.out.println("ApplicationSystem constructor");
    }
    public void openProgramA() {
        System.out.println("Opening program a...");
    }
    public void closeProgramB() {
        System.out.println("Closing program a...");
    }
}


