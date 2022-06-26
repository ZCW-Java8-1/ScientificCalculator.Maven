package com.zipcodewilmington.scientificcalculator;

import com.sun.tools.javac.Main;

import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.E;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {





    public static void main(String[] args) {

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//

        CoreFeatures x = new CoreFeatures();
      //  x.calc();

//        DisplayFeature y = new DisplayFeature();
//        y.setDisMode();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the backspace (!) key to enter radian/degree mode: ");
        String userInput = input.nextLine();

        if(userInput.equals("!")) {
            System.out.println("Yes");
        }








//        ScientificFeatures x = new ScientificFeatures();
//        double y = x.factorial(5);
//        System.out.println(y);
    }
}
