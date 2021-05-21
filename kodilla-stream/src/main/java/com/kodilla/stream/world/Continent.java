package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countrySet = new HashSet<>();

    public Continent(final String continentName){
        this.continentName = continentName;
    }
    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country){
        countrySet.add(country);
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }
}
