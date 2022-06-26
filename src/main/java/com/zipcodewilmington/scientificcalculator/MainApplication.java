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

//        CoreFeatures x = new CoreFeatures();
//
//        ScientificFeatures y = new ScientificFeatures();
//
//        System.out.println(y.inverse(0));

//        DisplayWork g = new DisplayWork();
//        g.store();

        MainApplication z = new MainApplication();
        z.clearScreen();


    }

    private int displayMode;
    //clear display
    String xinput = " ";
    int z;
    public void clearScreen() {
        z = 0;
        Scanner x = new Scanner(System.in);
        xinput = x.nextLine();
            System.out.println("\033[H\033[2J");
            System.out.flush();
            z++;
    }

    public void radianOrDegree() {

        ScientificFeatures Degree = new ScientificFeatures();
        ScientificFeatures Radian = new ScientificFeatures();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an exclamation (!) key to switch to degree mode or a hashtag (#) to switch to radian mode:");
        String userInput = input.nextLine();


        switch (userInput) {
            case "!":
                System.out.println("Degree");
                System.out.println("Please enter your number with a decimal point value only: ");
                double userInputNum = input.nextDouble();
                System.out.println(Degree.degreesNum(userInputNum));
                break;
            case "#":
                System.out.println("Radians");
                System.out.println("Please enter your number:");
                double userInputRad = input.nextDouble();
                System.out.println(Radian.radianNum(userInputRad));
                break;
            default:
                break;
        }
    }

}
