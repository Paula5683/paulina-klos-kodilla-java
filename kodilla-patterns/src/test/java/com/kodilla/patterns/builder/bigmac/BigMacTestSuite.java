package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigMacTestSuite {

    @Test
    void testBigMacBuild(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("ONION")
                .ingredient("SALAD")
                .ingredient("CHEESE")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);

    }
}
