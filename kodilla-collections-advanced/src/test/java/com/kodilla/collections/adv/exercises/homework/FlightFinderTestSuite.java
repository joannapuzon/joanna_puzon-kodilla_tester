package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Barcelona"));
        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("Warsaw", "Cracow"));

        assertEquals(flightList, result);
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Barcelona");
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Cracow", "Barcelona"));
        flightList.add(new Flight("London", "Barcelona"));
        flightList.add(new Flight("Warsaw", "Barcelona"));

        List<Boolean> listaTrue = new ArrayList<>();

        for (Flight flightFromFlightList : flightList) {
            for (Flight flightFromResultsList : result) {

                if (flightFromFlightList.getDeparture().contains(flightFromResultsList.getDeparture())) {
                    listaTrue.add(true);
                }

            }
        }
        assertEquals(listaTrue.size(), 3);
    }
}