package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int result = speed + 30;
        System.out.println(result);
    }

    @Override
    public void decreaseSpeed() {
        int result = speed - 20;
        System.out.println(result);

    }
}