package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public double result;



    public double add(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    public double subtraction(double num1, double num2){
        result = num1 - num2;
        return result;
    }

    public double multiplication(double num1, double num2){
        result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2){
        result = num1/num2;
        return result;
    }

    public double square(double num1) {
        result = num1 * num1;
        return result;
    }

    public double squareRoot(double num1) {
        result = Math.sqrt(num1);
        return result;
    }

    public double switchSign(double num1) {
        result = num1 * -1;
        return result;
    }

    public double inverse(double num1) {
        result = 1 / num1;
        if (num1 == 0) {
            // Should be error
            System.out.println("You cannot divide by 0");
        } else {
            return result;
        }
        return result;
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }


    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
