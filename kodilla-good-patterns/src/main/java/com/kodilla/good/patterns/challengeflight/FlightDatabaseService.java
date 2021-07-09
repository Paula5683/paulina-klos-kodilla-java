package com.kodilla.good.patterns.challengeflight;

import java.util.*;

public class FlightDatabaseService {

    Set<Flight> flights = new HashSet<>();

    public FlightDatabaseService(){
        this.flights.add(new Flight("Warsaw", "London"));
        this.flights.add(new Flight("Warsaw", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Gdansk"));
        this.flights.add(new Flight("Warsaw", "Krakow"));
        this.flights.add(new Flight("Berlin", "Paris"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Berlin", "London"));
        this.flights.add(new Flight("Berlin", "Madrid"));
        this.flights.add(new Flight("London", "Warsaw"));
        this.flights.add(new Flight("London", "Berlin"));
        this.flights.add(new Flight("London", "Dublin"));
        this.flights.add(new Flight("London", "Paris"));

    }
}
