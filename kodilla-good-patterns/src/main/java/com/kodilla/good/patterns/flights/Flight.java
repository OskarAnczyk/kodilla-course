package com.kodilla.good.patterns.flights;

import java.util.List;

public class Flight {
    private String deparatureAirport;
    private String arrivalAirport;

    public Flight(String deparatureAirport, String arrivalAirport) {
        this.deparatureAirport = deparatureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDeparatureAirport() {
        return deparatureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (getDeparatureAirport() != null ? !getDeparatureAirport().equals(flight.getDeparatureAirport()) : flight.getDeparatureAirport() != null)
            return false;
        return getArrivalAirport() != null ? getArrivalAirport().equals(flight.getArrivalAirport()) : flight.getArrivalAirport() == null;
    }

    @Override
    public int hashCode() {
        int result = getDeparatureAirport() != null ? getDeparatureAirport().hashCode() : 0;
        result = 31 * result + (getArrivalAirport() != null ? getArrivalAirport().hashCode() : 0);
        return result;
    }
}
