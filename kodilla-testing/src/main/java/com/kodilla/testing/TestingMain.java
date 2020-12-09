package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;
        int sum = a + b;
        int resultSum = calculator.add(a, b);
        if (sum == resultSum) {
            System.out.println("addition is correct");
        } else {
            System.out.println("addition is not correct");
        }

        int z = a - b;
        int resultZ = calculator.subtract(a, b);
        if (z == resultZ) {
            if (a - b == calculator.subtract(a, b)) {
                System.out.println("subtraction is correct");
            } else {
                System.out.println("subtraction is not correct");
            }
        }
    }
}
