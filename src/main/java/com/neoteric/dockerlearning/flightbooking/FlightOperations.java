package com.neoteric.dockerlearning.flightbooking;

public interface FlightOperations {
    String getAllAvailableFlights();
    String booking (Booking booking);
}
