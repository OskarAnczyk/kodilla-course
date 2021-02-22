package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.ONLY_LOGGER;
        //When
        String test = "log testowy";
        logger.log(test);
        //Then
        assertEquals(logger.getLastLog(),test);
    }

    @Test
    void ModifyLog(){
        //Given
        Logger logger = Logger.ONLY_LOGGER;
        logger.log("log1");
        //When
        logger.log("log2");
        //Then
        assertEquals(logger.getLastLog(),"log2");
    }
}
