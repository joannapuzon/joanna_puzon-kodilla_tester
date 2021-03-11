package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Circuit circuit = new Circuit(2,4);
        SuraceArea suraceArea = new SuraceArea(1, 4);

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(circuit);

        ShapeProcessor processor1 = new ShapeProcessor();
        processor1.process(suraceArea);
        }
    }