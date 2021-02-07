package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();

        if (airports.containsKey(flight.getArrivalAirport())) {
            return airports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }

    public boolean findFlight2(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();

        Boolean result = airports.get(flight.getArrivalAirport());

        if (result == null) {
            throw new RouteNotFoundException();
        }

        return result;
    }

}
