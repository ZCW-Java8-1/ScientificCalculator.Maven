package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public static void run() {

        boolean calcOn = true;

        double displayVal = 0.0;

        String displayMode = "decimal";

        System.out.println("Current value: " + displayVal);

        while (calcOn == true) {
            String operator = Console.getStringInput("Enter the operation you wish to perform: ");

            if (operator.equals("exit")) break;
            else if (operator.equals("clear")) displayVal = 0.0;
            else if (operator.equals("switch")) {
                displayMode = switchDisplayMode(displayMode);
                System.out.println("The display mode is now " + displayMode + ".");
            }
            else if (operator.equals("+")) displayVal = Operation.twoNumOp("+", displayVal);
            else if (operator.equals("-")) displayVal = Operation.twoNumOp("-", displayVal);
            else if (operator.equals("*")) displayVal = Operation.twoNumOp("*", displayVal);
            else if (operator.equals("/")) displayVal = Operation.twoNumOp("/", displayVal);
            else if (operator.equals("^")) displayVal = Operation.twoNumOp("^", displayVal);
            else if (operator.equals("sq")) displayVal = Operation.oneNumOp("sq", displayVal);
            else if (operator.equals("sqrt")) displayVal = Operation.oneNumOp("sqrt", displayVal);
            else if (operator.equals("inverse")) displayVal = Operation.oneNumOp("inverse", displayVal);
            else if (operator.equals("invert")) displayVal = Operation.oneNumOp("invert", displayVal);
            else if (operator.equals("sin")) displayVal = Operation.oneNumOp("sin", displayVal);
            else if (operator.equals("cos")) displayVal = Operation.oneNumOp("cos", displayVal);
            else if (operator.equals("tan")) displayVal = Operation.oneNumOp("tan", displayVal);
            else if (operator.equals("arcsin")) displayVal = Operation.oneNumOp("arcsin", displayVal);
            else if (operator.equals("arccos")) displayVal = Operation.oneNumOp("arccos", displayVal);
            else if (operator.equals("arctan")) displayVal = Operation.oneNumOp("arctan", displayVal);
            else if (operator.equals("log")) displayVal = Operation.oneNumOp("log", displayVal);
            else if (operator.equals("invlog")) displayVal = Operation.oneNumOp("invlog", displayVal);
            else if (operator.equals("nlog")) displayVal = Operation.oneNumOp("nlog", displayVal);
            else if (operator.equals("invnlog")) displayVal = Operation.oneNumOp("invnlog", displayVal);
            else if (operator.equals("!")) displayVal = Operation.factorial("!", displayVal);
            else {
                System.out.println("Invalid operation, please enter help for a list of operations");
                continue;
            }

            printDisplay(displayMode, displayVal);
        }
    }

    public static String switchDisplayMode(String currentMode) {
        // Have the user enter the mode they wish to switch to
        String s = Console.getStringInput("Enter the display mode you wish to switch to (leave blank to auto-rotate): ");
        if (s.equals("decimal")) return "decimal";
        else if (s.equals("hexadecimal")) return "hexadecimal";
        else if (s.equals("octal")) return "octal";
        else if (s.equals("binary")) return "binary";
        // If the user enters blank or enters an invalid display mode, then rotate between the display modes
        else {
            if (currentMode.equals("decimal")) return "hexadecimal";
            else if (currentMode.equals("hexadecimal")) return "binary";
            else if (currentMode.equals("binary")) return "octal";
            else return "decimal";
        }
    }

    public static void printDisplay(String displayMode, double displayVal) {
        if (displayMode.equals("octal")) System.out.println("Current value: " + Long.toOctalString(Double.doubleToRawLongBits(displayVal)));
        else if (displayMode.equals("hexadecimal")) System.out.println("Current value: " + Double.toHexString(displayVal));
        else if (displayMode.equals("binary")) System.out.println("Current value: " + Long.toBinaryString(Double.doubleToRawLongBits(displayVal)));
        else System.out.println("Current value: " + displayVal);
    }
}
