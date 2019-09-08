package com.kodilla.testing.calculator;

import static java.lang.System.out;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.addAToB(5, 1);
        out.println(result);


        int results = calculator.subtructAFromB(5, 1);
        out.println(results);

    }
}
