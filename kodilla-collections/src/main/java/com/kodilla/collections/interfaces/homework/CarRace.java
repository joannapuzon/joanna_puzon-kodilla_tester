package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50);
        doRace(ford);

        Opel opel = new Opel(40);
        doRace(opel);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
        System.out.println(car.getSpeed());
    }

    private int doRace() {
        return doRace();
    }
}