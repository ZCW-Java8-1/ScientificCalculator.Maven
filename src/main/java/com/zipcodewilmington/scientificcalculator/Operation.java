package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.sql.SQLOutput;

import static java.lang.Math.PI;

public class Operation {
    // Two number operations
    public static double twoNumOp(String operation, double displayVal) {
        double num1 = 0, num2 = 0, result = 0, memoryVal = 0;

        // Scan first number and store
        String s1 = Console.getStringInput("Enter the first number to perform operation (leave blank to use current value): ");
        if (s1.equals("")) num1 = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                num1 = Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }

        // Scan second number and store
        String s2 = Console.getStringInput("Enter the second number to perform operation (leave blank to use current value): ");
        if (s2.equals("")) num2 = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                num2 = Double.parseDouble(s2);
            } catch (NumberFormatException e) {
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }

        // Perform the operation
        if (operation.equals("+")) result = add(num1, num2);
        else if (operation.equals("-")) result = subtract(num1, num2);
        else if (operation.equals("*")) result = multiply(num1, num2);
        else if (operation.equals("/")) result = divide(num1, num2, displayVal);
        else if (operation.equals("^")) result = power(num1, num2);

        return result;
    }

    public static double oneNumOp(String operation, double displayVal) {
        double n = 0, result = 0;

        String s1 = Console.getStringInput("Enter the number to perform operation (leave blank to use current value): ");
        if (s1.equals("")) n = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                n = Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }
        if (operation.equals("sq")) result = sq(n);
        else if (operation.equals("sqrt")) result = sqrt(n, displayVal);
        else if (operation.equals("inverse")) result = inverse(n);
        else if (operation.equals("invert")) result = invert(n);
        else if (operation.equals("log")) result = Math.log10(n);
        else if (operation.equals("invlog")) result = Math.pow(10, n);
        else if (operation.equals("ln")) result = Math.log(n);
        else if (operation.equals("e")) result = Math.exp(n);
        else if (operation.equals("sin")) result = Math.sin(n);
        else if (operation.equals("cos")) result = Math.cos(n);
        else if (operation.equals("tan")) result = Math.tan(n);
        else if (operation.equals("arcsin")) result = Math.asin(n);
        else if (operation.equals("arccos")) result = Math.acos(n);
        else if (operation.equals("arctan")) result = Math.atan(n);
        else if (operation.equals("circ")) result = circ(n);

        return result;
    }

    // Trig function
    public static double trigOp(String operation, double displayVal, boolean degree) {
        double n = 0, result = 0;

        String s1 = Console.getStringInput("Enter the number to perform operation (leave blank to use current value): ");
        if (s1.equals("")) n = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                n = Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }
        if (operation.equals("sin")) result = sin(n, degree);
        else if (operation.equals("tan")) result = tan(n, degree);
        else if (operation.equals("cos")) result = cos(n, degree);
        return result;

    }

    // Factorial function
    public static double factorial(String operation, double displayVal) {
        double n = 0;
        String s1 = Console.getStringInput("Enter the number to perform operation (leave blank to use current value): ");
        if (s1.equals("")) n = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                n = Double.parseDouble(s1);
            } catch (NumberFormatException e) {
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // Addition
    public static double add(double num1, double num2) {

        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {

        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {

        return num1 * num2;
    }

    // Division
    // We pass displayVal as a method as a way to store displayVal in "memory"
    // This way, if an error occurs, we can set the current value displayed on the calculator to the displayVal
    public static double divide(double num1, double num2, double displayVal) {

        if (num2 == 0.0) {
            System.out.println("Error: cannot divide by zero, please try again.");
            return displayVal;
        } else return num1 / num2;
    }

    // Variable exponentiation
    public static double power(double num1, double num2) {

        return Math.pow(num1, num2);
    }

    // Square
    public static double sq(double n) {

        return n * n;
    }
    public static double circ(double n) {

        return 2 * PI *n;
    }

    // Inverse of the number
    public static double inverse(double n) {

        return 1 / n;
    }

    // Invert the sign of the number on the display (switch between positive and negative)
    public static double invert(double n) {

        return n * -1;
    }

    public static double sqrt(double n, double displayVal) {
        if (n < 0.0) {
            System.out.println("Error: cannot take the square root of a negative number, please try again.");
            return displayVal;
        } else return Math.sqrt(n);
    }

    public static double sin(double n, boolean degree) {
        double radian;
        if (degree == true) {
            radian = Math.toRadians(n);
        } else radian = n;
        return Math.sin(radian);
    }

    public static double tan(double n, boolean degree) {
        double radian;
        if (degree == true) {
            radian = Math.toRadians(n);
        } else radian = n;
        return Math.tan(radian);
    }

    public static double cos(double n, boolean degree) {
        double radian;
        if (degree == true) {
            radian = Math.toRadians(n);
        } else radian = n;
        return Math.cos(radian);
    }
}