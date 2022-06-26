package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class CalculatorScientific {

//science calc with correct number of decimals: https://www.eeweb.com/tools/online-scientific-calculator/

//- Switch display mode (binary, octal, decimal, hexadecimal)
//  - `switchDisplayMode()` should rotate through the options
//  - `switchDisplayMode(String mode)` should set the display to the mode given
//- Memory - Store up to one numeric value in memory for recall later (default to 0) *
//            - (`M+` key) Add the currently displayed value to the value in memory (store in memory and update display) *
//            - (`MC` key) Reset memory *
//            - (`MRC` key) Recall the current value from memory to the display *
//XXXX- Trig functions
//XXXX- Sine - Calculate the sine of the displayed value and display it
//XXXX- Cosine - Calculate the cosine of the displayed value and display it
//XXXX- Tangent - Calculate the tangent of the displayed value and display it
//XXXX- Inverse Sine
//XXXX- Inverse Cosine
//XXXX- Inverse Tangent
//- Switch trig units mode (Degrees, Radians)
//- `switchUnitsMode()` should rotate through the options
//- `switchUnitsMode(String mode)` should set the trig units to the type given
//- Logarithmic functions
//- Log
//- 10<sup>x</sup> (inverse logarithm)
//- Ln (natural logarithm)
//- e<sup>x</sup> (inverse natural logarithm)
//- Factorial function

    static Scanner scan = new Scanner(System.in);


    public void switchDisplayMode() {

    }


    //SINE
    public static double sine(double num1) {
//        System.out.println("Sine of: ");
//        value = scan.nextDouble();
        System.out.println(Math.sin(num1));
        return Math.sin(num1);
    }

    //COSINE
    public double cosine(double num1) {
//        System.out.println("Cosine of: ");
//        value = scan.nextDouble();
        System.out.println(Math.cos(num1));
        return Math.cos(num1);
    }

    //TANGENT
    public double tangent(double num1) {
//        System.out.println("Tangent of: ");
//        value = scan.nextDouble();
        System.out.println(Math.tan(num1));
        return Math.tan(num1);
    }

    //ARCSINE AKA INVERSE SINE
    public double inverseSine(double num1) {
//        System.out.println("Inverse Sine of: ");
//        value = scan.nextDouble();
        System.out.println(Math.asin(num1));
        return Math.asin(num1);
    }

    //ARC COSINE AKA INVERSE COSINE
    public double inverseCosine(double num1) {
//        System.out.println("Inverse Cosine of: ");
//        value = scan.nextDouble();
        System.out.println(Math.acos(num1));
        return Math.acos(num1);
    }

    //ARC TANGENT AKA INVERSE TANGENT
    public double inverseTangent(double num1) {
//        System.out.println("Inverse Tangent of: ");
//        value = scan.nextDouble();
        System.out.println(Math.atan(num1));
        return Math.atan(num1);
    }

    //DEGREES TO RADIANS
    public double degreesToRadians(double num1) {
        System.out.println(Math.toRadians(num1));
        return Math.toRadians(num1);
    }
}