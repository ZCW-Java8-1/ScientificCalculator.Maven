package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeFeaturesTest {

    @Test
    public void testCube() {
        CubeFeatures objCalcUnderTest = new CubeFeatures();
        double number1 = 2;
        double expectedResult = 8;
        double result = objCalcUnderTest.cube(number1);
        Assert.assertEquals(expectedResult, result, 0.010);
    }
}