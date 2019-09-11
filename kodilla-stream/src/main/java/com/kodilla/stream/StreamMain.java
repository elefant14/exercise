package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.util.Locale.ENGLISH;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToBeautify = poemBeautifier.beautify("This text is beautiful", (decorateText ->  "ABC" + decorateText + "ABC"));
        System.out.println(textToBeautify);

        String textToBeautify1 = poemBeautifier.beautify("This text is beautiful", (decorateText ->decorateText.toUpperCase(ENGLISH)));
        System.out.println(textToBeautify1);

        String textToBeautify2 = poemBeautifier.beautify("This text is beautiful", (decorateText -> decorateText.trim()));
        System.out.println(textToBeautify2);

        String textToBeautify3 = poemBeautifier.beautify("This text is beautiful", (decorateText -> String.valueOf(((decorateText.startsWith("#Th"))))));
        System.out.println(textToBeautify3);
    }
}