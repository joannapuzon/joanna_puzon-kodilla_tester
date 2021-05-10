package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> flightTable = new ArrayList<>();
        flightTable.add(new Flight("London", "Miami"));
        flightTable.add(new Flight("Warsaw","Berlin"));
        flightTable.add(new Flight("Warsaw", "Barcelona"));
        flightTable.add(new Flight("Athens", "Berlin"));
        return flightTable;

    }
}