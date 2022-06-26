package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        Scanner input = new Scanner(System.in);
        ScientificFunctionality sf = new ScientificFunctionality();

        System.out.print("Enter number: ");
        double screen = input.nextDouble();

        System.out.print("Enter operation: ");
        String operation = input.next();
        String operator = operation.toLowerCase();

        switch (operator) {
            case "clear":
                screen = 0;
                Console.println("Answer: %s", screen);
                break;
            case "add":
                System.out.println("Enter number: ");
                double num2 = input.nextDouble();
                Console.println("Answer: %s", screen + num2);
                break;
            case "subtract":
                System.out.println("Enter number: ");
                num2 = input.nextDouble();
                Console.println("Answer: %s", screen - num2);
                break;
            case "multiply":
                System.out.println("Enter number: ");
                num2 = input.nextDouble();
                Console.println("Answer: %s", screen * num2);
                break;
            case "divide":
                System.out.println("Enter number: ");
                num2 = input.nextDouble();
                Console.println("Answer: %s", screen / num2);
                break;
            case "square":
                screen *= screen;
                Console.println("Answer: %s", screen);
                break;
            case "squareroot":
                screen = Math.sqrt(screen);
                Console.println("Answer: %s", screen);
                break;
            case "exponent":
            case "inverse":
            case "negative":
            case "sin":
                screen = sf.calcSine(screen);
                Console.println("Answer: %s", screen);
                break;
            case "cos":
                screen = sf.calcCoSine(screen);
                Console.println("Answer: %s", screen);
                break;
            case "tan":
                screen = sf.calcTangent(screen);
                Console.println("Answer: %s", screen);
                break;
            case "arcsin":
                screen = sf.calcInverseSine(screen);
                Console.println("Answer: %s", screen);
                break;
            case "arccos":
                screen = sf.calcInverseCosine(screen);
                Console.println("Answer: %s", screen);
                break;
            case "arctan":
                screen = sf.calcInverseTangent(screen);
                Console.println("Answer: %s", screen);
                break;
            case "log":
                screen = sf.calcLog(screen);
                Console.println("Answer: %s", screen);
                break;
            case "inverselog":
                screen = sf.calcInverseLog(screen);
                Console.println("Answer: %s", screen);
                break;
            case "ln":
                screen = sf.calcNaturalLog(screen);
                Console.println("Answer: %s", screen);
                break;
            case "inverseln":
                screen = sf.calcInverseNaturalLog(screen);
                Console.println("Answer: %s", screen);
                break;
// Need to figure out the memory and mode switching functionality
            default:
                System.out.println("Command not recognized");
                break;
        }
    }
}
