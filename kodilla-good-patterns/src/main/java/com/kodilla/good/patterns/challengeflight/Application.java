package com.kodilla.good.patterns.challengeflight;


public class Application {

    public static void main(String[] args) {
        FlightSearchService flightSearchService = new FlightSearchService();
        System.out.println("All flights:");
        flightSearchService.getFlights();
        System.out.println("Flights from:");
        flightSearchService.FindFlightFrom("london");
        System.out.println("Flights to:");
        flightSearchService.FindFlightTo("warsaw");
        System.out.println("Flights with change:");
        flightSearchService.FindFlightWithChange("warsaw", "paris");


    }
}
