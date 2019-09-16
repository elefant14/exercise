package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent>listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleOnTheWorld = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));

        return peopleOnTheWorld;
    }
}
