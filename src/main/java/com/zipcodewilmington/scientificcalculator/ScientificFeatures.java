package com.zipcodewilmington.scientificcalculator;


public class ScientificFeatures {
    private double result;


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
            System.out.println("Err");
        } else {
            return result;
        }
        return result;

    }


    public double sine(double num1) {
        result = Math.sin(Math.toRadians(num1));
        return result;
    }

    public double cos(double num1) {
        result = Math.cos(Math.toRadians(num1));
        return result;
    }

    public double tan(double num1) {
        result = Math.tan(Math.toRadians(num1));
        return result;
    }

    public double inverseSine(double opposite, double hypotenuse) {
        //Talk to group about this one
        result = Math.asin(opposite / hypotenuse);
        return result;
    }

    public double inverseCosine(double adjacent, double hypotenuse) {
        // Talk to group about this one
        result = Math.acos(adjacent / hypotenuse);
        return result;
    }

    public double inverseTangent(double opposite, double adjacent) {
        // Talk to group about this one
        result = Math.atan(opposite / adjacent);
        return result;
    }

    public double factorial(double num1) {
        // Talk to group about this code
        result = 1;
        if (num1 < 0) {
            System.out.println("You cannot get a factorial of a negative number");
        } else if (num1 >= 0) {
            for (int i = 1; i < num1; i++) {
                result += result * i;
            }
        }
        return result;
    }

    public double log(double num1) {
        result = Math.log10(num1);
        return result;

    }

    public double inverseLog(double num1) {
        result = Math.pow(10, num1);
        return result;
    }

    public double ln(double num1) {
        // Talk to group
        result = Math.log(num1);
        return result;
    }

    public double inverseLn(double num1) {
        result = Math.pow(Math.E, num1);
        return result;
    }





}
