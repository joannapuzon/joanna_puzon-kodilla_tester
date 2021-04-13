package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }


    public static Car drawCar() {
        Random random = new Random();
        int drawnCarType = random.nextInt(2);
        int a = random.nextInt() * 5;
        int b = random.nextInt() * 5;
        if (drawnCarType == 0)
            return new Opel(a);
        else if (drawnCarType == 10)
            return new Ford(b);
        else
            return new Ford(b);

    }
}
