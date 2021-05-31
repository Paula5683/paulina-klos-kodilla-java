package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {

        public void findFlight(Flight flight) throws RouteNotFoundException {
            Map<String, Boolean> flightMap = new HashMap<>();
            flightMap.put("London",true);
            flightMap.put("Paris",false);
            flightMap.put("New York",true);
            flightMap.put("Seattle",true);
            flightMap.put("Havana",false);
            if (flightMap.get(flight.getDepartureAirport()) == null){
                throw new RouteNotFoundException();
            }
            if (flightMap.get(flight.getDepartureAirport())){
                System.out.println("Departure Airport available");
            } else {
                System.out.println("Departure Airport not available");
            }
        }

    public static void main(String[] args) {
        Flight flight = new Flight("London", "Warsaw");
        Flight flight1 = new Flight("Paris", "Warsaw");
        Flight flight2 = new Flight("Rome", "Warsaw");
        FindFlight findFlight = new FindFlight();
        try {
            findFlight.findFlight(flight);
            findFlight.findFlight(flight1);
            findFlight.findFlight(flight2);
        }catch (RouteNotFoundException e){
            System.out.println("Route not found");
        }finally {
            System.out.println("Thank you for using our services");
        }
    }

}