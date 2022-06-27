package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeRootFeaturesTest {

    @Test
    public void testCubeRoot() {
        CubeRootFeatures objCalcUnderTest = new CubeRootFeatures();
        double number1 = 9;
        double expectedResult = 2.080083823051904;
        double result = objCalcUnderTest.cubeRoot(number1);
        Assert.assertEquals(expectedResult, result, 0.010);
    }
}