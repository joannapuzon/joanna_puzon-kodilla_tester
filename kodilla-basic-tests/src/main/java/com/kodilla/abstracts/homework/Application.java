package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2);
        System.out.println(rectangle.calculateCircumference());
        System.out.println(rectangle.calculateSurfaceArea());

        Person janek = new Person(35,"Janek",new Driver(2000,"prowadzenie autobusu"));

        System.out.println(janek.age + " " + janek.firstName + " " + janek.job.getSalary() + " " + janek.job.getResponsibilities() );
//        SuraceArea suraceArea = new SuraceArea(1, 4);

//        ShapeProcessor processor = new ShapeProcessor();
//        processor.process(rectangle);
//
//        ShapeProcessor processor1 = new ShapeProcessor();
//        processor1.process(suraceArea);
        }
    }