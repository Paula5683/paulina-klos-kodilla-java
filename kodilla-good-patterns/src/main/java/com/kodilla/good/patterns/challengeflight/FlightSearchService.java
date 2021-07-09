package com.kodilla.good.patterns.challengeflight;

import java.util.List;
import java.util.stream.Collectors;


public class FlightSearchService {

   private final FlightDatabaseService flightDatabaseService = new FlightDatabaseService();

   public void getFlights(){
      flightDatabaseService.flights.stream()
              .map(Flight::toString)
              .forEach(System.out::println);
   }
   public void FindFlightFrom(String city){
      flightDatabaseService.flights.stream()
              .filter(flight -> flight.getDeparture().equalsIgnoreCase(city))
              .map(Flight::toString)
              .forEach(System.out::println);
   }
   public void FindFlightTo(String city){
      flightDatabaseService.flights.stream()
              .filter(flight -> flight.getArrival().equalsIgnoreCase(city))
              .map(Flight::toString)
              .forEach(System.out::println);
   }
   public void FindFlightWithChange(String start, String end) {
      List<Flight> flightStart = flightDatabaseService.flights.stream()
              .filter(flight -> flight.getDeparture().equalsIgnoreCase(start))
              .collect(Collectors.toList());
      List<Flight> flightEnd = flightDatabaseService.flights.stream()
              .filter(flight -> flight.getArrival().equalsIgnoreCase(end))
              .collect(Collectors.toList());
      for(Flight first: flightStart){
         for(Flight second: flightEnd){
            if(first.getArrival().equals(second.getDeparture())){
               System.out.println(first);
               System.out.println(second);
            }
         }
      }
   }
}
