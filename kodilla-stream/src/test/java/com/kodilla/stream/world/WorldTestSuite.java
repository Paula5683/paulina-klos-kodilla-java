package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        Country uk = new Country("United Kingdom", new BigDecimal("56000001"));
        Country france = new Country("France", new BigDecimal ("67022265"));
        Country italy = new Country ("Italy", new BigDecimal("62759921"));
        Country spain = new Country ("Spain", new BigDecimal("47510001"));
        Country canada = new Country("Canada", new BigDecimal("37864567"));
        Country usa = new Country("United States", new BigDecimal("327564123"));
        Country haiti = new Country("Haiti", new BigDecimal("11098645"));
        Country argentine = new Country("Argentina", new BigDecimal("44409909"));
        Country brazil = new Country("Brazil", new BigDecimal("209387196"));
        Country uruguay = new Country("Uruguay", new BigDecimal("3444097"));
        Country nepal = new Country("Nepal", new BigDecimal("28094564"));
        Country japan = new Country("Japan", new BigDecimal("127202100"));
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent asia = new Continent("Asia");
        World world = new World();
        //When
        europe.addCountry(france);
        europe.addCountry(italy);
        europe.addCountry(uk);
        europe.addCountry(spain);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(haiti);
        southAmerica.addCountry(argentine);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(uruguay);
        asia.addCountry(nepal);
        asia.addCountry(japan);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(asia);
        BigDecimal totalPopulation = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPopulation = new BigDecimal("1022357389");
        Assertions.assertEquals(expectedPopulation, totalPopulation);


    }
}
