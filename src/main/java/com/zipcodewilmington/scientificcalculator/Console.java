package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private double answer;
    private boolean onButton;
    private double firstNumber;
    private double secondNumber;
    private String switchSignFormulaHolder = "";
    private String switchSignFormulaHolderNegSecond = "";
    private boolean wrongOperator;


    public void calcRun() {

        // While loop initiation
        onButton = true;

        String operator;

        // Objects
        Scanner Calculator = new Scanner(System.in);
        ScientificFeatures switchSignFormula = new ScientificFeatures();
        Scanner inputEsc = new Scanner(System.in);
        CoreFeatures clear = new CoreFeatures();


        while (onButton) {
            // loop wrong operator true
            wrongOperator = true;
            // print for operator choices
            System.out.println("For addition, subtraction, division, or multiplication please enter one of these as operator: + - / * ");
            System.out.println("For the square, square-root, cube, cube-root, switch-sign or fac, please enter one of these as the operator **(square) */ (squareRoot) +/-(switch sign) fac (factorial)");
            System.out.println("For the inverse, sine, cosine, tan, invsine, incosine or invtangent, please type one of the respective operators.");

            System.out.println();
            // print enter number
            System.out.print("Enter first number ");
            firstNumber = Calculator.nextDouble();

            // Attempt to handle the error, but need a try/catch

<<<<<<< HEAD
            // check if the operator sees a sign
            System.out.println("Enter math operator to use for this calculation");
            operator = Calculator.next();


            System.out.print("Enter second number ");
            secondNumber = Calculator.nextDouble();

            // switch operator for the operators
            switch (operator) {
                case "+":
                    CoreFeatures additionFormula = new CoreFeatures();
                    String additionFormulaRead = String.valueOf((int) additionFormula.add(firstNumber, secondNumber));
=======
            // print calculator choice
            System.out.print("Enter math operator to use for this calculation ");
            operator = Calculator.next();

            System.out.print("Enter second number ");
            secondNumber = Calculator.nextDouble();


            switch (operator) {
                case "+":
                    CoreFeatures additionFormula = new CoreFeatures();
                    String additionFormulaRead = String.valueOf(additionFormula.add(firstNumber, secondNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(additionFormulaRead);
                    break;
                case "-":
                    CoreFeatures subtractionFormula = new CoreFeatures();
<<<<<<< HEAD
                    String subtractionFormulaRead = String.valueOf((int) subtractionFormula.subtract(firstNumber, secondNumber));
=======
                    String subtractionFormulaRead = String.valueOf(subtractionFormula.subtract(firstNumber, secondNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(subtractionFormulaRead);
                    break;
                case "/":
                    CoreFeatures divisionFormula = new CoreFeatures();
<<<<<<< HEAD
                    String divisionFormulaRead = String.valueOf((int) divisionFormula.div(firstNumber, secondNumber));
=======
                    String divisionFormulaRead = String.valueOf(divisionFormula.div(firstNumber, secondNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(divisionFormulaRead);
                    break;
                case "*":
                    CoreFeatures multiplyFormula = new CoreFeatures();
<<<<<<< HEAD
                    String multiplyFormulaRead = String.valueOf((int) multiplyFormula.mult(firstNumber, secondNumber));
=======
                    String multiplyFormulaRead = String.valueOf(multiplyFormula.mult(firstNumber, secondNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(multiplyFormulaRead);
                    break;
                case "**":
                    ScientificFeatures squareFormula = new ScientificFeatures();
<<<<<<< HEAD
                    String squareFormulaPrint = String.valueOf((int) squareFormula.square(firstNumber));
=======
                    String squareFormulaPrint = String.valueOf(squareFormula.square(firstNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(squareFormulaPrint);
                    break;
                case "***":
                    ScientificFeatures cubeFormula = new ScientificFeatures();
<<<<<<< HEAD
                    String cubeFormulaPrint = String.valueOf((int) cubeFormula.cubeRoot(firstNumber));
                case "+/-":
                    String switchSignFomrulaRead = String.valueOf((int) switchSignFormula.switchSign(firstNumber));
=======
                    String cubeFormulaPrint = String.valueOf(cubeFormula.cubeRoot(firstNumber));
                case "+/-":
                    String switchSignFomrulaRead = String.valueOf(switchSignFormula.switchSign(firstNumber));
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
                    System.out.println(switchSignFomrulaRead);
                    break;
                case "*/":
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
<<<<<<< HEAD
                        break;
            }

            // Exit and restart
            System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
=======
                    do {
                        System.out.println("Do you want to exit? \nPlease enter Y or press N to clear the display");
                        String inputEscRead = inputEsc.next();
                        if (inputEscRead.equalsIgnoreCase("Y")) {
                            onButton = false;
                        } else if (inputEscRead.equalsIgnoreCase("N")) {
                            clear.clear();
                            wrongOperator = false;
                        } else {
                            System.out.println("Please enter the correct letter");
                        }
                        break;
                    } while (!wrongOperator);
            }
            System.out.println("Do you want to exit? \n Please enter Y or press N to clear the display");
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
            String inputEscRead = inputEsc.next();
            if (inputEscRead.equalsIgnoreCase("Y")) {
                onButton = false;
            } else if (inputEscRead.equalsIgnoreCase("N")) {
                System.out.println("\033[H\033[2J");
                System.out.flush();
<<<<<<< HEAD
                Console reRun = new Console();
                reRun.calcRun();
=======
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6
            } else {
                System.out.println("Please enter the correct letter");
            }
        }

    }
<<<<<<< HEAD
}



=======
>>>>>>> fec307c1f392ee6b5b77f8d988e4ba54fa0a37a6

}


//
//    public static void print(String output, Object... args) {
//        System.out.printf(output, args);
//    }
//
//
//    public static void println(String output, Object... args) {
//        print(output + "\n", args);
//    }
//
//    public static String getStringInput(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public static Integer getIntegerInput(String prompt) {
//        return null;
//    }
//
//    public static Double getDoubleInput(String prompt) {
//        return null;
//    }
//}
