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

            else {
                System.out.println("Invalid operation, please enter help for a list of operations");
                continue;
            }

            System.out.println("Current value: " + displayVal);
        }


    }

}
