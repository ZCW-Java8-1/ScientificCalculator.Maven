package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigUnitTest {

    @Test
    void nextMode() {
        ScientificCalc calc = new ScientificCalc();
        toString() expectedResult = Math.cos(1);
        double result = objSciCalcTest.cos(1);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }
}