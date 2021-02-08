package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public List<Flight> getFlights() {
        List<Flight> flightsFromDataBase = new ArrayList<>();

        Flight flight1 = new Flight("Gdansk","Warszawa");
        Flight flight2 = new Flight("Gdansk","Katowice");
        Flight flight3 = new Flight("Gdansk","Wroclaw");
        Flight flight4 = new Flight("Katowice","Warszawa");
        Flight flight5 = new Flight("Katowice","Gdansk");
        Flight flight6 = new Flight("Berlin","Warszawa");
        Flight flight7 = new Flight("Berlin","Amsterdam");
        Flight flight8 = new Flight("Amsterdam","Warszawa");
        Flight flight9 = new Flight("Amsterdam","Katowice");
        Flight flight10 = new Flight("Amsterdam","Gdansk");
        Flight flight13 = new Flight("Warszawa","Gdansk");
        Flight flight14 = new Flight("Warszawa","Wroclaw");
        Flight flight15 = new Flight("Warszawa","Katowice");
        Flight flight11 = new Flight("Wroclaw","Gdansk");
        Flight flight12 = new Flight("Wroclaw","Warszawa");


        flightsFromDataBase.add(flight1);
        flightsFromDataBase.add(flight2);
        flightsFromDataBase.add(flight3);
        flightsFromDataBase.add(flight4);
        flightsFromDataBase.add(flight5);
        flightsFromDataBase.add(flight6);
        flightsFromDataBase.add(flight7);
        flightsFromDataBase.add(flight8);
        flightsFromDataBase.add(flight9);
        flightsFromDataBase.add(flight10);
        flightsFromDataBase.add(flight11);
        flightsFromDataBase.add(flight12);
        flightsFromDataBase.add(flight13);
        flightsFromDataBase.add(flight14);
        flightsFromDataBase.add(flight15);


        return flightsFromDataBase;
    }

}
