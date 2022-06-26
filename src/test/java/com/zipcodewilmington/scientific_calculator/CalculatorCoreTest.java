package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorCore;
import com.zipcodewilmington.scientificcalculator.CalculatorScientific;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class CalculatorCoreTest {
    private CalculatorCore objCalcUnderTest;

    @Before
    public void setUp() {
        objCalcUnderTest = new CalculatorCore();
    }

    @Test
    public void additionTest() {
        //Gerkin Statement IF WHEN THEN
        //If
        double firstValue = 1.5; double secondValue = 2;
        double expected = 3.5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.addition(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void subtractionTest() {
        //If
        double firstValue = 5.5; double secondValue = 2.0;
        double expected = 3.5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.subtraction(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void multiplicationTest() {
        //If
        double firstValue = 5; double secondValue = 2;
        double expected = 10;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.multiplication(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void divisionTest() {
        //If
        double firstValue = 6; double secondValue = 2;
        double expected = 3;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.division(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void squareTest() {
        //If
        double num1 = 5;
        double expected = 25;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.square(num1);

        //Then
        assertEquals(actual, expected, 0.01d);
    }
}
