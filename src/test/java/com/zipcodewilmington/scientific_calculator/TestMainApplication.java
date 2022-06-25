package com.zipcodewilmington.scientific_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void testAddition (){
        double expected = 21;
        int x=12;
        int y=9;
        double actual = BasicCalculator.add(x,y);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testSubtraction(){
        double expected = 3;
        int x=12;
        int y=9;
        double actual = BasicCalculator.subtract(x,y);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testMultiplication(){
        double expected = 21;
        int x=12;
        int y=9;
        double actual = BasicCalculator.multiply(x,y);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testDivision(){
        double expected = 21;
        int x=12;
        int y=9;
        double actual = BasicCalculator.divide(x,y);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testModulus(){
        double expected = 21;
        int x=12;
        int y=9;
        double actual = BasicCalculator.modulus(x,y);
        Assertions.assertEquals(expected,actual);
    }
