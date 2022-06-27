package com.zipcodewilmington.scientificcalculator;

import static org.junit.Assert.*;

public class CalculationsTest {

    @org.junit.Test
    public void addition() {
        assertEquals(Double.valueOf(1) , Calculations.addition(.5 , .5));
        assertEquals(Double.valueOf(10) , Calculations.addition(5 , 5));
        assertEquals(Double.valueOf(100) , Calculations.addition(87 , 13));
        assertEquals(Double.valueOf(1000) , Calculations.addition(460 , 540));

    }

    @org.junit.Test
    public void subtraction() {
        assertEquals(Double.valueOf(1), Calculations.subtraction(7, 6));
        assertEquals(Double.valueOf(10), Calculations.subtraction(12, 2));
        assertEquals(Double.valueOf(100), Calculations.subtraction(140, 40));
        assertEquals(Double.valueOf(1000), Calculations.subtraction(1500, 500));
    }

    @org.junit.Test
    public void multiplication() {
        assertEquals(Double.valueOf(1), Calculations.multiplication(1, 1));
        assertEquals(Double.valueOf(10), Calculations.multiplication(5, 2));
        assertEquals(Double.valueOf(100), Calculations.multiplication(5, 20));
        assertEquals(Double.valueOf(1000), Calculations.multiplication(50, 20));
    }

    @org.junit.Test
    public void division() {
        assertEquals(Double.valueOf(1), Calculations.division(2, 2));
        assertEquals(Double.valueOf(10), Calculations.division(250, 25));
        assertEquals(Double.valueOf(100), Calculations.division(400, 4));
        assertEquals(Double.valueOf(1000), Calculations.division(10000, 10));

    }

    @org.junit.Test
    public void squared() {
        assertEquals(Double.valueOf(25), Calculations.squared(5));
        assertEquals(Double.valueOf(225), Calculations.squared(15));
        assertEquals(Double.valueOf(2500), Calculations.squared(50));
        assertEquals(Double.valueOf(10000), Calculations.squared(100));
    }

    @org.junit.Test
    public void squareRoot() {
        assertEquals(Double.valueOf(5), Calculations.squareRoot(25));
        assertEquals(Double.valueOf(15), Calculations.squareRoot(225));
        assertEquals(Double.valueOf(50), Calculations.squareRoot(2500));
        assertEquals(Double.valueOf(100), Calculations.squareRoot(10000));
    }

    @org.junit.Test
    public void exponent() {
        assertEquals(Double.valueOf(1), Calculations.exponent(1, 1));
        assertEquals(Double.valueOf(27),Calculations.exponent(3, 3));
        assertEquals(Double.valueOf(729), Calculations.exponent(9, 3));
        assertEquals(Double.valueOf(1000),Calculations.exponent(10, 3));

    }

    @org.junit.Test
    public void inverse() {
        assertEquals(Double.valueOf(.1), Calculations.inverse(10));
        assertEquals(Double.valueOf(.002), Calculations.inverse(500));
        assertEquals(Double.valueOf(1), Calculations.inverse(1));
        assertEquals(Double.valueOf(.5), Calculations.inverse(2));
    }

    @org.junit.Test
    public void invert() {
        assertEquals(Double.valueOf(0), Calculations.invert(0));
        assertEquals(Double.valueOf(-10), Calculations.invert(10));
        assertEquals(Double.valueOf(-729), Calculations.invert(729));
        assertEquals(Double.valueOf(-1000), Calculations.invert(1000));
    }

    @org.junit.Test
    public void clear() {
    }
}