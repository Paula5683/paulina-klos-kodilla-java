package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final Set<Continent> continentSet = new HashSet<>();

    public void addContinent(Continent continent){
        continentSet.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = continentSet.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country :: getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

}
