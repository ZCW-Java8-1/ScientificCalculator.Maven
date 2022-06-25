package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        ScientificFunctionality sf = new ScientificFunctionality();
//        System.out.println(sf.getUnitsMode());
//        System.out.println(sf.calcInverseLog(5));
//        System.out.println(sf.calcInverseNaturalLog(5));
//        System.out.println(sf.calcLog(5));
//        System.out.println(sf.calcNaturalLog(5));
        System.out.println(Math.sin(90));
        System.out.println(sf.calcSine(90));
        sf.switchUnitsMode("Radians");
        System.out.println(sf.calcSine(90));

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
    }
}
