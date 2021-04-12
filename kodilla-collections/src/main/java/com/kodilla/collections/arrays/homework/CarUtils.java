package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Shape kind " + getShapeName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getShapeName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";

    }
}


