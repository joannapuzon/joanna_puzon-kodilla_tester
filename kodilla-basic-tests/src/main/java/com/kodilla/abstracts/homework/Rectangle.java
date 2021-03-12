package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    int a;

    public Rectangle(int a) {
        this.a = a;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculateCircumference() {
        return 4 * a;
    }
}