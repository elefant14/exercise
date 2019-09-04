package com.kodilla;

public class Calculator {
    int addAToB(int A, int B) {
        return A + B;
    }

    int subtructAFromB(int A, int B) {
        return A - B;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5, 1);
        int results = calculator.subtructAFromB(5, 1);
        System.out.println(result);
        System.out.println(results);
    }
}

