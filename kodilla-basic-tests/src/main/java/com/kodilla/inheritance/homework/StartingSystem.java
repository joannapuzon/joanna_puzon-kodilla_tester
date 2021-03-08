package com.kodilla.inheritance.homework;

public class StartingSystem {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1995);
        operatingSystem.turnOn();

        ApplicationSystem applicationSystem = new ApplicationSystem(1990);
        applicationSystem.openProgramA();
        System.out.println(applicationSystem.getYearOfMade());

    }
}
