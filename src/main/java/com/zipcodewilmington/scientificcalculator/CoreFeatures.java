package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CoreFeatures {


        //A state, representing the value currently displayed on the calculator (default 0)
        //Get current number on display
        //Clear display
        //Change number on display
        //Calculate the square (x2) and square root (√x) of the number on the display
        //Create a calculator that can perform addition, subtraction, multiplication, division
        //Calculate variable exponentiation (xy)
        //Calculate the inverse of the number on the display (1/x)
        //Invert the sign of the number on the display (switch between positive and negative)
        //Update the display to Err if an error occurs (eg: Division by zero)
        //Errors must be cleared before any other operation can take place
        //Each operation should automatically update the display

    public double firstNumber;
    public double secondNumber;
    public double answer;
        private static int displayMode;
        public static void setDisplayMode(int givenDisplayMode) {
        displayMode = givenDisplayMode;
    }


    public void calc(){
        double answer = 0;
        String operator;

        Scanner Calculator = new Scanner(System.in);

        System.out.println("\\\\CALCULATOR\\\\");

        System.out.println("Enter first number");
        firstNumber = Calculator.nextDouble();

        System.out.println("Enter math operator to use for this calculation");
        operator = Calculator.next();

        System.out.println("Enter second number)");
        secondNumber = Calculator.nextDouble();

        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "/":
                answer = firstNumber / secondNumber;
                break;
            case "*":
                answer = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Incorrect operator");
                break;
        }

        System.out.println(answer);

    }

    }

