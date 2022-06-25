package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public static void run() {

        boolean calcOn = true;

        double displayVal = 0.0;

        System.out.println("Current value: " + displayVal);

        while (calcOn == true) {
            String s = Console.getStringInput("Enter the operation you wish to perform: ");

            if (s.equals("exit")) break;
            else if (s.equals("clear")) displayVal = 0.0;
            else if (s.equals("+")) displayVal = Operation.twoNumOp("+", displayVal);
            else if (s.equals("-")) displayVal = Operation.twoNumOp("-", displayVal);
            else {
                System.out.println("Invalid operation, please enter help for a list of operations");
                continue;
            }

            System.out.println("Current value: " + displayVal);
            System.out.println("test");
        }
    }
}
