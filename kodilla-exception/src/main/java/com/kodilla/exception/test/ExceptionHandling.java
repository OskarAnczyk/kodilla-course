package com.kodilla.exception.test;

public class ExceptionHandling {
    public void secondChallengeExceptionHandling(){
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 10;
        double y = 2.5;
        String result = "Not done";

        try {
            result = secondChallenge.probablyIWillThrowException(x,y);
        } catch(Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println(result);
        }
    }
}
