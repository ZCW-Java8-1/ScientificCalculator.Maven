package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMainApplication {

    BasicCalculator calc = new BasicCalculator();

    @Test
    public void testAddition() {
        double expected = 21;
        int screen = 12;
        int num2 = 9;
        double actual = calc.add(screen, num2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSubtraction() {
        double expected = 15;
        int screen = 20;
        int num2 = 5;
        double actual = calc.subtract(screen, num2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMultiplication() {
        double expected = 40;
        int screen = 10;
        int num2 = 4;
        double actual = calc.multiply(screen, num2);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDivision() {
        double expected = 27;
        int screen = 54;
        int num2 = 2;
        double actual = calc.divide(screen, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testModulus() {
        double expected = 0;
        int screen = 50;
        int num2 = 5;
        double actual = calc.modulus(screen, num2);
        Assertions.assertEquals(expected, actual);
    }

}
=======
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
        double expected = 15;
        int x=20;
        int y=5;
        double actual = BasicCalculator.subtract(x,y);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testMultiplication(){
        double expected = 40;
        int x=10;
        int y=4;
        double actual = BasicCalculator.multiply(x,y);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testDivision(){
        double expected = 27;
        int x=54;
        int y=2;
        double actual = BasicCalculator.divide(x,y);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testModulus(){
        double expected = 0;
        int x=50;
        int y=5;
        double actual = BasicCalculator.modulus(x,y);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public
