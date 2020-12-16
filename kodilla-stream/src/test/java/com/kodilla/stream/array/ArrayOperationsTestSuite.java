package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        double expected = 2.5;
        assertEquals(expected,result);
    }
}
