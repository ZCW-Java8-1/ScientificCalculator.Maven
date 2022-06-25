package com.zipcodewilmington.scientificcalculator;


public class Calculations {

    public static Double addition(double value1, double value2) {
        double sum = value1 + value2;
        return sum;

    }

    public static Double subtraction(double value1, double value2) {
        double difference = value1 - value2;
        return difference;
    }

    public static Double multiplication(double value1, double value2) {
        double product = value1 * value2;
        return product;
    }

    public static Double division(double value1, double value2) {
        double quotient = value1 / value2;
        return quotient;
    }

    public static Double squared(double value1) {
        double sq = value1 * value1;
        return sq;
    }

    public static Double squareRoot(double value1) {

        double sqrt = Math.sqrt(value1);
        return sqrt;
    }

    public static Double exponent(double value1, double value2) {
        double exp = Math.pow(value1, value2);
        return exp;
    }

    public static Double inverse(double value1) {
        double ins = 1 / value1;
        return ins;
    }

    public static Double invert(double value1) {
        double inv = -1 * value1;
        if (value1 == 0) {
            return (double) 0;
        } else {
            return inv;

        }
    }


    public static void clear() {
        System.out.println("");
    }
}
