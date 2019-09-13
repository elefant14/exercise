package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Locale.ENGLISH;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, Double::sum);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToBeautify = poemBeautifier.beautify("This text is beautiful", (decorateText -> "ABC" + decorateText + "ABC"));
        System.out.println(textToBeautify);

        String textToBeautify1 = poemBeautifier.beautify("This text is beautiful", (decorateText -> decorateText.toUpperCase(ENGLISH)));
        System.out.println(textToBeautify1);

        String textToBeautify2 = poemBeautifier.beautify("This text is beautiful", (String::trim));
        System.out.println(textToBeautify2);

        String textToBeautify3 = poemBeautifier.beautify("This text is beautiful", (decorateText -> String.valueOf(((decorateText.startsWith("#Th"))))));
        System.out.println(textToBeautify3);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .map(String::toUpperCase)
//
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

               Forum forum = new Forum();
                      Map<Integer, ForumUser> mapOfForumUsers = forum.getForumList().stream()
                              .filter(forumUser -> forumUser.getSex()=='M')
                              .filter(forumUser-> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                              .filter(forumUser -> forumUser.getPost()>=1)
                             .collect(Collectors.toMap(ForumUser::getIdentification, forumUser -> forumUser));



                      mapOfForumUsers.entrySet().stream()
                              .map(entry -> entry.getKey() + ": "+ entry.getValue())
                              .forEach(System.out::println);
    }
}
