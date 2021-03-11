package com.kodilla.abstracts.homework;

public abstract class Shape {
    protected double width;
    protected double height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void calculateSuraceArea() {
        double result = width * height;
        System.out.println("Surace " + result);
    }

    public void calculateCircuit() {
        double result = 2 * width + 2 * height;
        System.out.println("Circuit " + result);
    }
}