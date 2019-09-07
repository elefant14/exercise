package com.kodilla.testing.collection;

import java.util.ArrayList;
public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> results){
        ArrayList<Integer>oddNumbersList = new ArrayList<Integer>();

        for(int result : results){
            if(result%2==0){
                oddNumbersList.add(result);
            }
        }
        return oddNumbersList;
    }
}
