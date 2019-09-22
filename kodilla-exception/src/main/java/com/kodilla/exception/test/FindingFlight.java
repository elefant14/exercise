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

    void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightsMap = findFlightsMap();
        assert flightsMap != null;
        if (!flightsMap.containsKey(flight.getDepartureAirport()) &&
                !flightsMap.containsKey(flight.getArrivalAirport())) {

            throw new RouteNotFoundException("There is no flights");

        }
    }


    private String findAirport(String airportName) throws RouteNotFoundException {
        if (findFlightsMap().containsKey(airportName) && findFlightsMap().containsValue(true)) {


        } else {
            throw new RouteNotFoundException("Sorry, I can't find an airport");
        }
return airportName;

    }
}







