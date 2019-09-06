package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    private int number;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseArrayList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer>emptyList = new ArrayList<Integer>();
        ArrayList<Integer>result = oddNumbersExterminator.exterminate(emptyList);

        System.out.println("Testing emptyList ");
        //Then
        Assert.assertEquals(emptyList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer>normalList = new ArrayList<Integer>();

        if (number%2==0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }
        ArrayList<Integer>results = oddNumbersExterminator.exterminate(normalList);

        System.out.println("Testing normalList ");
        //Then
        Assert.assertEquals(normalList, results);
    }
}
