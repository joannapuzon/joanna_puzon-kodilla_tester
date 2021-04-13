package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(60));
        cars.add(new Opel(45));

        cars.remove(1);
        Ford ford = new Ford(60);
        cars.remove(ford);

        System.out.println(cars.size());
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
