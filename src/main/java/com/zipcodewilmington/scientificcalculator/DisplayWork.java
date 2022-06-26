package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class DisplayWork {
    private int loopFor;
    private double answer;
    private boolean onButton;


    public void  store() {
        double firstNumber;
        double secondNumber;

        String operator;
        Scanner Calculator = new Scanner(System.in);
        System.out.println("Please enter only these operations + - / * (square) ** */ (squareRoot) +/-(switch sign) fac (factorial) \n inverse sine cosine tan \n invsine incosine invtangent");

        System.out.print("Enter first number ");
        firstNumber = Calculator.nextDouble();

        System.out.print("Enter math operator to use for this calculation ");
        operator = Calculator.next();

        System.out.print("Enter second number ");
        secondNumber = Calculator.nextDouble();

        switch (operator) {
            case "+":
                CoreFeatures additionFormula = new CoreFeatures();
                String additionFormulaRead = String.valueOf((int)additionFormula.add(firstNumber, secondNumber));
                System.out.println(additionFormulaRead);
                break;
            case "-":
                CoreFeatures subtractionFormula = new CoreFeatures();
                String subtractionFormulaRead = String.valueOf((int)subtractionFormula.subtract(firstNumber, secondNumber));
                System.out.println(subtractionFormulaRead);
            case "/":
                CoreFeatures divisionFormula = new CoreFeatures();
                String divisionFormulaRead = String.valueOf((int)divisionFormula.div(firstNumber, secondNumber));
                System.out.println(divisionFormulaRead);
            case "*":
                CoreFeatures multiplyFormula = new CoreFeatures();
                String multiplyFormulaRead = String.valueOf((int)multiplyFormula.mult(firstNumber,secondNumber));
                System.out.println(multiplyFormulaRead);
            case "**":
                    ScientificFeatures squareFormula = new ScientificFeatures();
                    String squareFormulaPrint = String.valueOf((int)squareFormula.square(firstNumber));
                    System.out.println(squareFormulaPrint);

                break;
            case "*/":
                ScientificFeatures squareRootFormula = new ScientificFeatures();
                String squareRootFormulaPrint = String.valueOf(squareRootFormula.squareRoot(firstNumber));
                System.out.println(squareRootFormulaPrint);
                break;
            case "+/-":
                ScientificFeatures switchSignFormula = new ScientificFeatures();
                String switchSignFormulaRead = String.valueOf(switchSignFormula.switchSign(firstNumber));
                System.out.println(switchSignFormulaRead);
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
                String arcSineRead = String.valueOf(arcSine.inverseSine(firstNumber, secondNumber));
                System.out.println(arcSineRead);
                    break;
            case "invcosine":
                ScientificFeatures arcCosine = new ScientificFeatures();
                String arcCosineRead = String.valueOf(arcCosine.inverseCosine(firstNumber, secondNumber));
                System.out.println(arcCosineRead);
                    break;
            case "invtangent":
                    ScientificFeatures arcTan = new ScientificFeatures();
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
                break;
        }
        Scanner inputEsc = new Scanner(System.in);
        System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
        String inputEscRead = inputEsc.next();
        if(inputEscRead.equalsIgnoreCase("Y")) {
            onButton = false;
        } else if (inputEscRead.equalsIgnoreCase("N")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }else {
            System.out.println("Please enter the correct letter");
        }


    }


    }

