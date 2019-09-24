package com.kodilla.exception.test;

public class FindFlightsTest {

    public static void main(String[] args) {
        Flight fromParisToNYC = new Flight("CDG", "JFK");
        Flight fromNYCToUluru = new Flight("JFK", "Yulara");

        FindFlight findFlight = new FindFlight();

        try {
              findFlight.findAirport("CDG");
            System.out.println("You have 3 connection flights : " + fromParisToNYC);
        } catch (RouteNotFoundException e) {
            System.out.println("I'm sorry, I can't find any flight. Please try another mode of transport");
        }

        try {
             findFlight.findAirport("Okécie");
            System.out.println("I'm sorry, there is no flight " + fromNYCToUluru);
        } catch (RouteNotFoundException e) {
            System.out.println("Yulara has not an airport");
        }
    }
}
