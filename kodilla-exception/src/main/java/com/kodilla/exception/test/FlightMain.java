package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args){
        Flight flight = new Flight("Airport1","Airport2");
        FlightFinder flightFinder = new FlightFinder();

        try{
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println("Route not found: " + e);
        } finally {
            System.out.println("Flight finding ended.");
        }
    }
}
