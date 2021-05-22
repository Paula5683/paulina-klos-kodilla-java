package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite{
    @Test
    void testGetAverage(){
        //Given
        int [] numbers = {4,8,1,5,9,4,7,13,10,52,3,72,81,11,8,4,1,7,4,20};
        //When
        double average = getAverage(numbers);
        //Then
        Assertions.assertEquals(16.2, average);
    }
}
