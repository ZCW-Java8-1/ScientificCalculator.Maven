package com.zipcodewilmington.scientificcalculator;


public class CoreFeatures {


    //Subtraction
    public double subtract(double number1, double number2) {

        return number1 - number2;
    }

    //Addition
    public double add(double number1, double number2) {

        return number1 + number2;
    }

    //Multiplication
    public double mult(double number1, double number2) {

        return number1 * number2;
    }

    //Division
    public double div(double number1, double number2) {

        return number1 / number2;
    }

    public void clear() {
        System.out.println(System.lineSeparator().repeat(100));
    }

//    public static void main(String args[]) {
//
//        double firstNumber;
//        double secondNumber;
//        double answer = 0;
//        String operator;
//
//        Scanner Calculator = new Scanner(System.in);
//
//        System.out.println("\\\\CALCULATOR\\\\");
//
//        System.out.println("Enter first number");
//        firstNumber = Calculator.nextDouble();
//
//        System.out.println("Enter math operator to use for this calculation");
//        operator = Calculator.next();
//
//        System.out.println("Enter second number)");
//        secondNumber = Calculator.nextDouble();
//
//        switch (operator) {
//            case "+":
//                answer = firstNumber + secondNumber;
//                break;
//            case "-":
//                answer = firstNumber - secondNumber;
//                break;
//            case "/":
//                answer = firstNumber / secondNumber;
//                break;
//            case "*":
//                answer = firstNumber * secondNumber;
//                break;
//            default:
//                System.out.println("Incorrect operator");
//                break;
//        }
//
//        System.out.println(answer);
//    }
//}
}