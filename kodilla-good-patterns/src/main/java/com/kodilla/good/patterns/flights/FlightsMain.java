package com.kodilla.good.patterns.flights;

public class FlightsMain {
    public static void main(String[] args){
        FlightRepository flightRepository = new FlightRepository();
        FlightService flightService = new FlightService(flightRepository);

        flightService.findFlightsWithChange("Gdansk","Warszawa");
    }
}
