package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public static void run() {

        boolean calcOn = true;

        double displayVal = 0.0;

        System.out.println("Current value: " + displayVal);

        while (calcOn == true) {
            String operator = Console.getStringInput("Enter the operation you wish to perform: ");

            if (operator.equals("exit")) break;
            else if (operator.equals("clear")) displayVal = 0.0;
            else if (operator.equals("+")) displayVal = Operation.twoNumOp("+", displayVal);
            else if (operator.equals("-")) displayVal = Operation.twoNumOp("-", displayVal);
            else if (operator.equals("*")) displayVal = Operation.twoNumOp("*", displayVal);
            else if (operator.equals("/")) displayVal = Operation.twoNumOp("/", displayVal);
            else if (operator.equals("^")) displayVal = Operation.twoNumOp("^", displayVal);
            else if (operator.equals("sq")) displayVal = Operation.oneNumOp("sq", displayVal);
            else if (operator.equals("sqrt")) displayVal = Operation.oneNumOp("sqrt", displayVal);
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

            System.out.println("Current value: " + displayVal);
        }


    }

}
