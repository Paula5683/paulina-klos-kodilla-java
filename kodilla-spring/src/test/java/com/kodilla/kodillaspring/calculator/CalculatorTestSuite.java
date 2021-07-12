package com.kodilla.kodillaspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        double add = calculator.add(2, 2);
        double sub = calculator.sub(10, 5);
        double mul = calculator.mul(2,10);
        double div = calculator.div(100, 5);
        //Then
        assertEquals(4.0,add);
        assertEquals(5.0, sub);
        assertEquals(20.0, mul);
        assertEquals(20.0,div);
    }
}
