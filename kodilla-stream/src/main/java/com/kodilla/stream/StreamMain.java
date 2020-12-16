package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String poem = "Szlachetne zdrowie";
        poemBeautifier.beautify(poem,(s) -> "ABC" + s + "ABC");
        poemBeautifier.beautify(poem,(s) -> s.toUpperCase());
        poemBeautifier.beautify(poem,(s) -> s.toLowerCase());
        poemBeautifier.beautify(poem,(s) -> s + ".\n" + s + ".");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
