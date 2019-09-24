package com.kodilla.exception.test;


import java.util.HashMap;

class FindFlight {


    private HashMap<String, Boolean> findFlightsMap() {
        HashMap<String, Boolean> flightsMap = new HashMap<>();

        flightsMap.put("CDG", true);
        flightsMap.put("JFK", true);
        flightsMap.put("Yulara", false);

        return flightsMap;

    }




    public boolean findAirport(String airportName) throws RouteNotFoundException {
        if (findFlightsMap().containsKey(airportName) && findFlightsMap().get(airportName)) {

return true;
        } throw new RouteNotFoundException("There is no airport");


    }
}







