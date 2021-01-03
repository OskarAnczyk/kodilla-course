package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> airports = new HashMap<>();
        if(airports.containsKey(flight.getArrivalAirport())){
            if(airports.get(flight.getArrivalAirport())){
                System.out.println("Flight available");
            } else {
                System.out.println("Flight not available");
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
