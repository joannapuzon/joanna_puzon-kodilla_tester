package com.kodilla.abstracts.homework;

public class ShapeProcessor {

    public void process(Shape shape) {
        System.out.println("Circuit" + shape);
        shape.calculateCircuit();

        System.out.println("SuraceArea " + shape);
        shape.calculateSuraceArea();
    }
}