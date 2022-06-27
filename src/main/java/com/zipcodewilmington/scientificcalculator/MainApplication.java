package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
                                       public void run() {
                                           new CalcGUI();
                                       }
                                   });
       /*
       boolean exit = false;

        do {
            Scanner scanner = new Scanner(System.in);
            Console.println("Welcome to my calculator! \nThe current value is 0");
            double value1 = Console.getDoubleInput("Enter first number");
            char operations;
            Console.println("Select your operation: \n 0. Clear display \n 1. + \n 2. - \n 3. * \n 4. /" +
                    "\n 5. SQ \n 6. SQRT \n 7. EXP \n 8. Inverse \n 9. INV \n ");
            double value2;
            operations = scanner.next().charAt(0);

            switch (operations) {
                case '1':
                    value2 = Console.getDoubleInput("Please enter a second number to add: ");
                    Calculations.addition(value1, value2);
                    break;

                case '2':
                    value2 = Console.getDoubleInput("Please enter a second number to subtract: ");
                    Calculations.subtraction(value1, value2);
                    break;

                case '3':
                    value2 = Console.getDoubleInput("Please enter a second number to multiply: ");
                    Calculations.multiplication(value1, value2);
                    break;

                case '4':
                    value2 = Console.getDoubleInput("Please enter a second number to divide by: ");
                    while (value2 == 0) {
                        Console.println("Err");
                        value2 = Console.getDoubleInput("Please enter a second number that isn't 0: ");
                    }
                    Calculations.division(value1, value2);
                    break;

                case '5':
                    Calculations.squared(value1);
                    break;

                case '6':
                    Calculations.squareRoot(value1);
                    break;

                case '7':
                    value2 = Console.getDoubleInput("Please enter an exponent ");
                    Calculations.exponent(value1, value2);
                    break;

                case '8':
                    Calculations.inverse(value1);
                    break;

                case '9':
                    Calculations.invert(value1);

                    break;

                case '0':
                    Calculations.clear();
                    break;

       /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
            }
        } while (!exit);

    }
    */
    }
}
