package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

//    public String getContinentName() {
//        return continentName;
//    }

    List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }
}
