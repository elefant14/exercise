package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("CDG", true);
        flightsMap.put("JFK", true);
        flightsMap.put("Yulara", false);

        for (Map.Entry<String, Boolean> entry : flightsMap.entrySet()) {
            if (flightsMap.containsKey(flight.getArrivalAirport()) && flightsMap.containsValue(true)) {
                System.out.println("Your destination is: " + entry.getKey());
            } else {
                throw new RouteNotFoundException();
            }
        }

    }
}
