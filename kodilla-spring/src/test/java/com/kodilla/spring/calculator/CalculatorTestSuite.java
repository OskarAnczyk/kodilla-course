package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        double addResult = calculator.add(2,2);
        double subResult = calculator.sub(2,2);
        double mulResult = calculator.mul(2,2);
        double divResult = calculator.div(2,2);
        //Then
        assertAll(
                () -> assertEquals(addResult,4),
                () -> assertEquals(subResult,0),
                () -> assertEquals(mulResult,4),
                () -> assertEquals(divResult,1)
        );
    }
}
