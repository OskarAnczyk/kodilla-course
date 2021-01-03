package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testProbablyIWillThrowExceptionXMoreThan2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2,1));
    }

    @Test
    public void testProbablyIWillThrowExceptionXLessThan1() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1));
    }

    @Test
    public void testProbablyIWillThrowExceptionYExactly1AndHalf() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1,1.5));
    }
}
