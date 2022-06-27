package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class OperationTest {
    private Operation objOperationTest;

    @Before
    public void setUp (){
        objOperationTest = new Operation();
    }

    @Test
    public void testAddition() {
        int num1 = 5; int num2 = 6;
        int expectedResult = 11;
        double result = objOperationTest.add(num1, num2);
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testSubtraction() {
        int num1 = 10; int num2 = 5;
        int expectedResult = 5;
        double result = objOperationTest.subtract(num1, num2);
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    public void testMultiply() {
        int num1 = 5; int num2 = 5;
        int expectedResult = 25;
        double result = objOperationTest.multiply(num1, num2);
        Assert.assertEquals(expectedResult, result, 0.01);
    }

    public void testDivide() {
        int num1 = 10; int num2 = 2;
        int expectedResult = 5;
        double result = objOperationTest.divide(num1, num2, 0);
        Assert.assertEquals(expectedResult, result, 0.01);
    }

    public void testPower() {
        int num1 = 5; int num2 = 2;
        double expectedResult = Math.pow(num1, num2);
        double result = objOperationTest.power(num1, num2);
        Assert.assertEquals(expectedResult, result, 0.01);
    }

    public void testSqrt() {
        int n = 9;
        double expectedResult = Math.sqrt(n);
        double result = objOperationTest.sq(n);
        Assert.assertEquals(expectedResult, result,  0.01);
    }
}