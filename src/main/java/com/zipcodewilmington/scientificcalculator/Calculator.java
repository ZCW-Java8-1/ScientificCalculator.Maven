package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;


public class Calculator {
    Double x, y, mem, result;
    Console choiceString = new Console();
    // new Scanner item
    // Input section



    // Operator Choice
	// System.out.println("Choose an operator from '+' '-' '*' '/' '^sq' '^exp' '^y' '^neg 'inv'");

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int sqr(int x, int y) {
        y = (int) Math.pow(x,2);
        return y ;  //
    }

    public int root(int x, int y) {
        y = (int) Math.sqrt(x);
        return y;
    }

    public int inverse(int x, int y) {
        y = (int) Math.expm1(x);
        return y;
    }


    ///////////////// refer to private functions here

}
