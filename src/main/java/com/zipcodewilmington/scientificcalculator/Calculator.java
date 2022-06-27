package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;


public class Calculator {
    Double x, y, mem, result;
    String ans;
    String choiceString = "+";
    // MainApplication activeCalc = new MainApplication();

    // Input section
    public void Arithmetic(String[] args) {
        switch (choiceString) {
            // Case 1
            case "+" -> {
                // Print statement corresponding case

                // break keyword terminates the
                result = add(x, y);
                System.out.println("one");
            }
            // Case 2
            case "-" -> {
                // Print statement corresponding case
                result = subtract(x, y);
                System.out.println("two");
            }

            // Case 3
            case "*" -> {
                // Print statement corresponding case
                result = multiply(x, y);
                System.out.println("three");
            }
            // Case 4
            case "/" -> {
                // Print statement corresponding case
                result = divide(x, y);
                System.out.println("four");
            }
            case "square" -> {
                // Print statement corresponding case
                result = sqr(x);
                System.out.println("five");
            }
            case "sqrt" -> {
                // Print statement corresponding case
                result = root(x);
                System.out.println("six");
            }
            case "1/x" -> {
                // Print statement corresponding case
                result = inverse(x);
                System.out.println("seven");
            }
            case "+/-" -> {
                // Print statement corresponding case
                result = invertSign(x);
                System.out.println("eight");
            }
            case "x^y" -> {
                // Print statement corresponding case
                result = sqrY(x, y);
                System.out.println("eight");
            }
            default ->

                // Print statement corresponding case
                    System.out.println("Err, no match");
        }
        ans = String.format(String.valueOf(result));

    }


    // Operator Choice

	// System.out.println("Choose an operator from '+' '-' '*' '/' '^sq' '^exp' '^y' '^neg 'inv'");

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double sqr(double x) {
        return Math.pow(x, 2);  //
    }

    public double sqrY(double x, double y) {
        return Math.pow(x, y);
    }

    public double root(double x) {
        return Math.sqrt(x);
    }

    public double inverse(double x) {
        return Math.expm1(x);
    }

    public double invertSign(double x) {
        return x*-1;
    }


    ///////////////// refer to private functions here

}
