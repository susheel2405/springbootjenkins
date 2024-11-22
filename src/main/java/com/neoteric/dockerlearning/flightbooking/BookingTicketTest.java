package com.neoteric.dockerlearning.flightbooking;

public class BookingTicketTest {
    public static void main(String[] args) {


        Booking booking = new Booking("Susheel", "CIA234", 24);
        Booking booking1 = new Booking("Ravi", "FBI234", 22);

        FlightOperations airIndiaOperations = new AirIndia();
        airIndiaOperations.getAllAvailableFlights();

        String airIndiaResults  = airIndiaOperations.booking(booking);
        System.out.println(airIndiaResults+ "  " + booking);

        FlightOperations emiratesOperations  = new Emirates();
        emiratesOperations.getAllAvailableFlights();

        String emiratesResults = emiratesOperations.booking(booking);
        System.out.println(emiratesResults + "  " + booking1);
    }
}
