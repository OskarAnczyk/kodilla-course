package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("Test OK");
        }else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int a = 3;
        int b = 2;
        if(a + b == calculator.add(a,b)){
            System.out.println("addition is correct");
        } else {
            System.out.println("addition is not correct");
        }

        if(a - b == calculator.subtract(a,b)){
            System.out.println("substraction is correct");
        } else {
            System.out.println("substraction is not correct");
        }
    }
}
