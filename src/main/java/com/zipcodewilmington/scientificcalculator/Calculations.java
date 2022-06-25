package com.zipcodewilmington.scientificcalculator;


public class Calculations {

    public static Double addition(double value1, double value2) {
        double sum = value1 + value2;
        System.out.println(sum);
        return null;

    }

    public static Double subtraction(double value1, double value2) {
        System.out.println(value1 - value2);
        return null;
    }

    public static Double multiplication(double value1, double value2) {
        System.out.println(value1 * value2);
        return null;
    }

    public static Double division(double value1, double value2) {
        System.out.println(value1 / value2);
        return null;
    }

    public static Double squared(double value1) {
        System.out.println(value1 * value1);
        return null;
    }

    public static Double squareRoot(double value1) {

        System.out.println(Math.sqrt(value1));
        return null;
    }

    public static Double exponent(double value1, double value2) {
        System.out.println(Math.pow(value1, value2));
        return null;
    }

    public static Double inverse(double value1) {
        System.out.println(1 / value1);
        return null;
    }

    public static Double invert(double value1) {
        double invert = -1 * value1;
        if (value1 == 0) {
            System.out.println((double) 0);
        } else {
            System.out.println(invert);

        }
        return null;
    }


    public static void clear() {
        System.out.println("");
    }
}
