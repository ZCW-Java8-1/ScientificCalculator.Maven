package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public static void run() {

        boolean calcOn = true;

        double displayVal = 0.0;

        double memoryVal = 0.0;

        boolean degree = true;

        String displayMode = "decimal";

        System.out.println("Current value: " + displayVal);

        while (calcOn == true) {
            String operator = Console.getStringInput("Enter the operation you wish to perform: ");
            if (operator.equals("exit")) break;
            else if (operator.equals("clear")) displayVal = 0.0;
            else if (operator.equals("help")) printHelp();
            else if (operator.equals("switch")) {
                displayMode = switchDisplayMode(displayMode);
                System.out.println("The display mode is now " + displayMode + ".");
            }
            else if (operator.equals("M+")) {
                memoryVal = displayVal;
                System.out.println("Memory Value: " + displayVal);
            }
            else if (operator.equals("MRC")) {
                System.out.println("Memory Value: " + memoryVal);
            }
            else if (operator.equals("MC")){
                memoryVal=0;
                System.out.println("Memory Value: " + memoryVal);
            }
            else if (operator.equals("switch trig unit")) degree = !degree;
            else if (operator.equals("+")) displayVal = Operation.twoNumOp("+", displayVal);
            else if (operator.equals("-")) displayVal = Operation.twoNumOp("-", displayVal);
            else if (operator.equals("*")) displayVal = Operation.twoNumOp("*", displayVal);
            else if (operator.equals("/")) displayVal = Operation.twoNumOp("/", displayVal);
            else if (operator.equals("^")) displayVal = Operation.twoNumOp("^", displayVal);
            else if (operator.equals("sq")) displayVal = Operation.oneNumOp("sq", displayVal);
            else if (operator.equals("sqrt")) displayVal = Operation.oneNumOp("sqrt", displayVal);
            else if (operator.equals("inverse")) displayVal = Operation.oneNumOp("inverse", displayVal);
            else if (operator.equals("invert")) displayVal = Operation.oneNumOp("invert", displayVal);
            else if (operator.equals("circ")) displayVal = Operation.oneNumOp("circ", displayVal);
            else if (operator.equals("sin")) displayVal = Operation.trigOp("sin", displayVal, degree);
            else if (operator.equals("cos")) displayVal = Operation.trigOp("cos", displayVal, degree);
            else if (operator.equals("tan")) displayVal = Operation.trigOp("tan", displayVal, degree);
            else if (operator.equals("arcsin")) displayVal = Operation.oneNumOp("arcsin", displayVal);
            else if (operator.equals("arccos")) displayVal = Operation.oneNumOp("arccos", displayVal);
            else if (operator.equals("arctan")) displayVal = Operation.oneNumOp("arctan", displayVal);
            else if (operator.equals("log")) displayVal = Operation.oneNumOp("log", displayVal);
            else if (operator.equals("invlog")) displayVal = Operation.oneNumOp("invlog", displayVal);
            else if (operator.equals("ln")) displayVal = Operation.oneNumOp("ln", displayVal);
            else if (operator.equals("e")) displayVal = Operation.oneNumOp("e", displayVal);
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
    // Method that prints out a list of operations
    public static void printHelp() {
        System.out.println("Here are the list of operations:");
        System.out.println("Addition: +");
        System.out.println("Subtraction: -");
        System.out.println("Multiplication: *");
        System.out.println("Division: /");
        System.out.println("Square: sq");
        System.out.println("Square root: sqrt");
        System.out.println("Variable Exponentiation: ^");
        System.out.println("Inverse: inverse");
        System.out.println("Invert: invert");
        System.out.println("Sine: sin");
        System.out.println("Cosine: cos");
        System.out.println("Tangent: tan");
        System.out.println("Inverse Sine: arcsin");
        System.out.println("Inverse Cosine: arccos");
        System.out.println("Inverse Tangent: arctan");
        System.out.println("Log: log");
        System.out.println("Inverse Logarithm: invlog");
        System.out.println("Natural Logarithm: ln");
        System.out.println("Inverse Natural Logarithm: e");
        System.out.println("Factorial: !");
        System.out.println("Switch between display mode: switch");
        System.out.println("Four display modes: binary, octal, decimal, hexadecimal");
        System.out.println("Clear the display: clear");
        System.out.println("Turn off the calculator: exit");
        System.out.println("Add the currently displayed Value to the value in memory: M+");
        System.out.println("Reset memory: MC");
        System.out.println("Recall the current value from memory to display: MRC");
        System.out.println("Switch trig unit mode(Degree, Radians): switch trig unit");
        System.out.println("Circumference of a circle: circ");
    }
}
