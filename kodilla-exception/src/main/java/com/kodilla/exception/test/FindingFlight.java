package com.kodilla.exception.test;


import java.util.HashMap;

class FindFlight{


    private HashMap<String, Boolean> findFlightsMap() {
        HashMap<String, Boolean> flightsMap = new HashMap<>();

        flightsMap.put("CDG", true);
        flightsMap.put("JFK", true);
        flightsMap.put("Yulara", false);

        return (HashMap<String, Boolean>) flightsMap;

    }

    boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightsMap = findFlightsMap();
        assert flightsMap != null;
        if (!flightsMap.keySet().contains(flight.getDepartureAirport()) &&
                !flightsMap.keySet().contains(flight.getArrivalAirport())) {
        }
        throw new RouteNotFoundException("There is no flights");


    }
    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (findFlightsMap().containsKey(airportName)) {
        return true;

        }else{
            throw new RouteNotFoundException("Sorry, I can't find an airport");
        }
    }


}
