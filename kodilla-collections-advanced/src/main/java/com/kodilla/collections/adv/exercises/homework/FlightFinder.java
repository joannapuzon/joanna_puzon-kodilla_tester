package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsFrom = new ArrayList<>();
        FlightRepository.getFlightTable();
        for (Flight flight : FlightRepository.getFlightTable()){
            if (flight.getDeparture().contains(departure)){
                flightsFrom.add(flight);
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival){
        return Collections.emptyList();
    }
}

