package com.kodilla.testing.collection;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer>oddNumbersList = new ArrayList<Integer>();

        for(int number : numbers){
            if(number%2==0){
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
