package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findFlightsFrom(String departureAirport){
        List<Flight> resultList;

        resultList = flightRepository.getFlights().stream()
                .filter(flight -> flight.getDeparatureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        return resultList;
    }

    public List<Flight> findFlightsTo(String arrivalAirport){
        List<Flight> resultList;

        resultList = flightRepository.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        return resultList;
    }

    public Map<Flight,Flight> findFlightsWithChange(String departureAirport, String arrivalAirport){
        Map<Flight,Flight> resultMap = new HashMap<>();
        if(departureAirport.equals(arrivalAirport)){
            return resultMap;
        }
        List<Flight> departureFlightsList;
        List<Flight> middleFlightsList;

        departureFlightsList = findFlightsFrom(departureAirport);

        middleFlightsList = departureFlightsList.stream()
                .map(flight -> findFlightsFrom(flight.getArrivalAirport()))
                .flatMap(Collection::stream)
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        showFlightList(middleFlightsList);

        resultMap = departureFlightsList.stream()
                .flatMap(flight1 ->
                        middleFlightsList.stream()
                .filter(flight2 -> flight1.getArrivalAirport().equals(flight2.getDeparatureAirport()))
                .map(flight2 -> new AbstractMap.SimpleImmutableEntry<>(flight1,flight2)))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        return resultMap;
    }

    public void showFlightList(List<Flight> flightList){
        for (Flight flight:flightList) {
            System.out.println(flight.getDeparatureAirport());
        }
    }


    /*

    Zakladamy ze jest dokladnie jedna przesiadka.
    Metoda szukajaca przesiadek moglaby zwrocic Map<Flight, FLighT> gdzie kluczem bedzie pierwszy lot a wartoscia drugi.

     */
}
