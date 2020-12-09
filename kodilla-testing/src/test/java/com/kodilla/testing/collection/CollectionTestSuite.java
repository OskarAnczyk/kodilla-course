package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Starting one test for class OddNumberExterminator");
    }

    @AfterEach
    public void after(){
        System.out.println("Completed one test for class OddNumberExterminator");
    }

    @DisplayName("Tests if method exterminate() correctly returns an empty list if it is given an empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertTrue(resultList.isEmpty());
    }

    @DisplayName("Tests if method exterminate() correctly chooses only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        Integer[] beforeArray = {1,2,3,4,5,6,7,8};
        List<Integer> beforeList = Arrays.asList(beforeArray);

        Integer[] testArray = {2,4,6,8};
        //When
        List<Integer> afterList = oddNumbersExterminator.exterminate(beforeList);
        //Then
        Assertions.assertArrayEquals(testArray,afterList.toArray());
    }
}
