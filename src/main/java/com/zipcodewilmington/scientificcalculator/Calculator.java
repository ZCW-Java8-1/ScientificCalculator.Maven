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
            case "+":
                // Print statement corresponding case

                // break keyword terminates the
                result = add(x,y);
                System.out.println("one");
                break;
            // Case 2
            case "-":
                // Print statement corresponding case
                result = subtract(x,y);
                System.out.println("two");
                break;

            // Case 3
            case "*":
                // Print statement corresponding case
                result = multiply(x,y);
                System.out.println("three");
                break;
            // Case 4
            case "/":
                // Print statement corresponding case
                result = divide(x,y);
                System.out.println("four");
                break;
            case "square":
                // Print statement corresponding case
                result = sqr(x,y);
                System.out.println("five");
                break;
            case "sqrt":
                // Print statement corresponding case
                result = root(x,y);
                System.out.println("six");
                break;
            case "1/x":
                // Print statement corresponding case
                result = inverse(x,y);
                System.out.println("seven");
                break;
            case "+/-":
                // Print statement corresponding case
                result = invertSign(x,y);
                System.out.println("eight");
                break;
            case "x^y":
                // Print statement corresponding case
                result = sqrY(x,y);
                System.out.println("eight");
                break;
            default:

                // Print statement corresponding case
                System.out.println("Err, no match");
            break;
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

    public double sqr(double x, double y) {
        y = Math.pow(x,2);
        return y ;  //
    }

    public double sqrY(double x, double y) {
        double result = Math.pow(x, y);
        return result;
    }

    public double root(double x, double y) {
        y = Math.sqrt(x);
        return y;
    }

    public double inverse(double x, double y) {
        y = Math.expm1(x);
        return y;
    }

    public double invertSign(double x, double y) {
        y = x*-1;
        return y;
    }


    ///////////////// refer to private functions here

}
