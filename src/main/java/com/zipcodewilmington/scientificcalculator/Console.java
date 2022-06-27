package com.zipcodewilmington.scientificcalculator;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private boolean onButton;
    private double firstNumber;
    private double secondNumber;


    public void calcRun() {


        onButton = true;
        String operator;
        Scanner Calculator = new Scanner(System.in);
        ScientificFeatures switchSignFormula = new ScientificFeatures();
        Scanner inputEsc = new Scanner(System.in);
        Console reRun = new Console();

        while (onButton) {
            // loop wrong operator true
            // print for operator choices
            System.out.println("Type the function within the ().");
            System.out.println("For addition(+), subtraction(-), division(/), or multiplication(*)");
            System.out.println("For the square(**), square-root(**/), cube(***), cube-root(***/), switch-sign(+/-) or factorial(fac)");
            System.out.println("For the inverse, sine, cosine, tan, invsine, incosine or invtangent, write as they are presented");

            System.out.println();
            // print enter number
            System.out.print("Enter first number ");

            // try catch method for first number

            try {
                firstNumber = Calculator.nextDouble();
            } catch (InputMismatchException a) {
                System.out.println("Not a number");
                reRun.calcRun();
            }
                System.out.println("Enter math operator to use for this calculation");

            // try catch method for operator
                operator = Calculator.next();


            //try catch method for second number
                System.out.print("Enter second number ");
            try {
                secondNumber = Calculator.nextDouble();
            } catch (InputMismatchException a) {
                System.out.println("Not a number");

            }


            // switch statement for the operator
            switch (operator) {
                case "+":
                    CoreFeatures additionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String additionFormulaRead = String.valueOf(additionFormula.add(firstNumber, secondNumber));
                    System.out.println(additionFormulaRead);
                    break;
                case "-":
                    CoreFeatures subtractionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String subtractionFormulaRead = String.valueOf(subtractionFormula.subtract(firstNumber, secondNumber));
                    System.out.println(subtractionFormulaRead);
                    break;
                case "/":
                    CoreFeatures divisionFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String divisionFormulaRead = String.valueOf(divisionFormula.div(firstNumber, secondNumber));
                    System.out.println(divisionFormulaRead);
                    break;
                case "*":
                    CoreFeatures multiplyFormula = new CoreFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String multiplyFormulaRead = String.valueOf(multiplyFormula.mult(firstNumber, secondNumber));
                    System.out.println(multiplyFormulaRead);
                    break;
                case "**":
                    ScientificFeatures squareFormula = new ScientificFeatures();
                    String squareFormulaPrint = String.valueOf(squareFormula.square(firstNumber));
                    System.out.println(squareFormulaPrint);
                case "***":
                    ScientificFeatures cubeFormula = new ScientificFeatures();
                    String cubeFormulaPrint = String.valueOf(cubeFormula.cube(firstNumber));
                    System.out.println(cubeFormulaPrint);
                    break;
                case "***/":
                    ScientificFeatures cubeRtFormula = new ScientificFeatures();
                    String cubeRtFormulaPrint = String.valueOf(cubeRtFormula.cubeRoot(firstNumber));
                    System.out.println(cubeRtFormulaPrint);
                case "+/-":
                    String switchSignFormulaRead = String.valueOf(switchSignFormula.switchSign(firstNumber));
                    System.out.println(switchSignFormulaRead);
                    break;
                case "**/":
                    ScientificFeatures squareRootFormula = new ScientificFeatures();
                    String squareRootFormulaPrint = String.valueOf(squareRootFormula.squareRoot(firstNumber));
                    System.out.println(squareRootFormulaPrint);
                    break;
                case "inverse":
                    ScientificFeatures inverseFormula = new ScientificFeatures();
                    String inverseFormulaRead = String.valueOf(inverseFormula.inverse(firstNumber));
                    System.out.println(inverseFormulaRead);
                    break;
                case "sine":
                    ScientificFeatures sineFormula = new ScientificFeatures();
                    String sineFormulaRead = String.valueOf(sineFormula.sine(firstNumber));
                    System.out.println(sineFormulaRead);
                    break;
                case "cos":
                    ScientificFeatures cosineFormula = new ScientificFeatures();
                    String cosineFormulaRead = String.valueOf(cosineFormula.cos(firstNumber));
                    System.out.println(cosineFormulaRead);
                    break;
                case "tan":
                    ScientificFeatures tanFormula = new ScientificFeatures();
                    String tanFormulaRead = String.valueOf(tanFormula.tan(firstNumber));
                    System.out.println(tanFormulaRead);
                    break;
                case "invsine":
                    ScientificFeatures arcSine = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcSineRead = String.valueOf(arcSine.inverseSine(firstNumber, secondNumber));
                    System.out.println(arcSineRead);
                    break;
                case "invcosine":
                    ScientificFeatures arcCosine = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcCosineRead = String.valueOf(arcCosine.inverseCosine(firstNumber, secondNumber));
                    System.out.println(arcCosineRead);
                    break;
                case "invtangent":
                    ScientificFeatures arcTan = new ScientificFeatures();
                    System.out.print("Enter second number ");
                    secondNumber = Calculator.nextDouble();
                    String arcTanFormula = String.valueOf(arcTan.inverseTangent(firstNumber, secondNumber));
                    System.out.println(arcTanFormula);
                    break;
                case "fac":
                    ScientificFeatures factorialFormula = new ScientificFeatures();
                    String factorialFormulaRead = String.valueOf(factorialFormula.factorial(firstNumber));
                    System.out.println(factorialFormulaRead);
                    break;
                default:
                    System.out.println("Incorrect operator");
                        System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                        String inputEscRead = inputEsc.next();
                        if (inputEscRead.equalsIgnoreCase("Y")) {
                            onButton = false;
                        } else if (inputEscRead.equalsIgnoreCase("N")) {
                        } else {
                            System.out.println("Please enter the correct letter");
                        }
                        break;
            }

            // Exit Code
            System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
            String inputEscRead = inputEsc.next();
            if (inputEscRead.equalsIgnoreCase("Y")) {
                onButton = false;
            } else if (inputEscRead.equalsIgnoreCase("N")) {
                reRun.calcRun();
            } else {
                System.out.println("Please enter the correct letter");
            }
        }

    }

}


