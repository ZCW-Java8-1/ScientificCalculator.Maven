package com.zipcodewilmington.scientificcalculator;


public class CoreFeatures {


    //Subtraction
    public double subtract(double number1, double number2) {

        return number1 - number2;
    }

    //Addition
    public double add(double number1, double number2) {

        return number1 + number2;
    }

    //Multiplication
    public double mult(double number1, double number2) {

        return number1 * number2;
    }

    //Division
    public double div(double number1, double number2) {

        return number1 / number2;
    }

    public void clear() {
        System.out.println(System.lineSeparator().repeat(100));
    }

}