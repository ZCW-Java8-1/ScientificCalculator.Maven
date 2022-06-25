package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScientificFts {

    public static void main(String[] args) {
        ScientificFts tester = new ScientificFts();
        tester.displayGreeting();
//        tester.userInput();
        String input = tester.userInput();

        switch (input) {
            case "q":
                System.out.println("quitting calculator");
                break;
            case "d":
                tester.switchDisplayMode(33);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
    }
    public void displayGreeting() {
        String greeting = "execute scientific features";
        String separator = "************************************************";
        String switchDisplay = "d: switch display mode(binary, octal, decimal, hexadecimal)\n";
        String quit = "q: quit";

        String menu = greeting.toUpperCase() + "\n" + separator + "\n" +
                 switchDisplay + quit;
        System.out.println(menu);
    }

    public String userInput() {
        Scanner sc = new Scanner(System.in);
        String nextMode = sc.nextLine();

        return nextMode;
    }

    void switchDisplayMode(int num) {
        DecimalFormat df = new DecimalFormat("0.00");

        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));
        int index = 0;

        String[] modeTitles = {"binary", "octal", "decimal", "hexadecimal"};
        String[] arr = {binary, octal, decimal, hexadecimal};
        boolean displayModeActive = true;

        while (displayModeActive) {
            System.out.println("cycling through display modes...");
            if (userInput().equals("dm")) {
                System.out.println(modeTitles[index] + ": " + arr[index]);
                index++;

                if (index == arr.length) {
                    index = 0;
                }
            }
            else {
                displayModeActive = false;
//                displayGreeting();
//                userInput();
            }
        }
    }
}
