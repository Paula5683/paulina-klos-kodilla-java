package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: testing the list");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case:test is complete");
    }
    @DisplayName("When create a List, then exterminate should return list with even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator newList = new OddNumbersExterminator();

        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> expectedResult = Arrays.asList(2,4);
        List<Integer> list2 = Arrays.asList(22,10,5,7,12);
        List<Integer> expectedResult2 = Arrays.asList(22,10,12);
        List<Integer> list3 = Arrays.asList(0,2,4,6);
        List<Integer> expectedResult3 = Arrays.asList(0,2,4,6);
        //When
        List<Integer> result = newList.exterminate(list);
        List<Integer> result2 = newList.exterminate(list2);
        List<Integer> result3 = newList.exterminate(list3);
        //Then
        assertEquals(expectedResult, result);
        assertEquals(expectedResult2, result2);
        assertEquals(expectedResult3, result3);
    }
    @DisplayName("When create Empty List, then exterminate should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        List<Integer> list = Arrays.asList();
        List<Integer> expectedResult = Arrays.asList();
        //When
        List<Integer> result = emptyList.exterminate(list);
        //Then
        assertEquals(expectedResult, result);
    }
}
