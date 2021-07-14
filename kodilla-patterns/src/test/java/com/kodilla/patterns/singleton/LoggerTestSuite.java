package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.LOG;
        //When
        logger.log("123.543.657");
        String log = logger.getLastLog();
        //Then
        assertEquals("123.543.657", log);


    }
}
