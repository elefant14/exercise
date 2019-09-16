package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int grades[] = {3, 5, 4, 2, 3, 1, 5, 5, 2, 4, 3, 2, 5, 4, 2, 3, 3, 2, 4, 5};
        double averageGrades = 3.35;
        //When
        double average = ArrayOperations.getAverage(grades);
        //Then
        Assert.assertEquals(averageGrades, average, 0.1);
    }
}
