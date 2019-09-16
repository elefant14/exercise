package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent africa = new Continent("Africa");
        Continent australia = new Continent("Australia");
        Continent europa = new Continent("Europa");

        Country italy = new Country("Italy");
        Country greece = new Country("Greece");
        Country malta = new Country("Malta");
        Country iceland = new Country("Iceland");
        Country zimbabwe = new Country("Zimbabwe");
        Country tanzania = new Country("Tanzania");
        Country madagascar = new Country("Madagascar");
        Country newzeland = new Country("New Zeland");
        Country australiaC = new Country("Australia");

        world.addContinent(africa);
        world.addContinent(australia);
        world.addContinent(europa);

        africa.addCountry(zimbabwe);
        africa.addCountry(madagascar);
        africa.addCountry(tanzania);

        australia.addCountry(australiaC);
        australia.addCountry(newzeland);

        europa.addCountry(italy);
        europa.addCountry(greece);
        europa.addCountry(malta);
        europa.addCountry(iceland);
        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("4938888105");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
