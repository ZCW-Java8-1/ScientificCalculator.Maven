package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.sql.SQLOutput;

public class Operation {
    // Two number operations
    public static double twoNumOp(String operation, double displayVal) {
        double num1 = 0, num2 = 0, result = 0;

        // Scan first number and store
        String s1 = Console.getStringInput("Enter the first number to perform operation (leave blank to use current value): ");
        if (s1.equals("")) num1 = displayVal;
        else {
            try {
                // Try to parse the user input into a double
                num1 = Double.parseDouble(s1);
            } catch (NumberFormatException e){
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
            } catch (NumberFormatException e){
                System.out.println("You did not input a valid number. The number has been set to the default value of 0.");
            }
        }

        // Perform the operation
        if (operation.equals("+")) result = add(num1, num2);
        else if (operation.equals("-")) result = subtract(num1, num2);
        else if (operation.equals("*")) result = multiply(num1, num2);
        else if (operation.equals("/")) result = divide(num1, num2);
        else if (operation.equals("^")) result = power(num1, num2);

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
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    // Variable exponentiation
    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

}
