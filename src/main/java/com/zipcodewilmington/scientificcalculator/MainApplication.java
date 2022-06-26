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

        ScientificFeatures y = new ScientificFeatures();
        System.out.println(y.inverse(0));


        ScientificFeatures radToDegree = new ScientificFeatures();
        radToDegree.radianOrDegree();









    }
}
