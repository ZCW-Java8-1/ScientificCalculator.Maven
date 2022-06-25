package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.ScientificFunctionality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestScientificFunctionality {
    ScientificFunctionality sciFunction = new ScientificFunctionality();
    @Test
    public void testCalcLog() {
        double expected = 0.60205999132;
        double input = 4;
        double actual = sciFunction.calcLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseLog() {
        double expected = 1000;
        double input = 3;
        double actual = sciFunction.calcInverseLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcNaturalLog() {
        double expected = 1.60943791243;
        double input = 5;
        double actual = sciFunction.calcNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseNaturalLog() {
        double expected = 20.0855369232;
        double input = 3;
        double actual = sciFunction.calcInverseNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSine() {
        double expected = 0.8414709848;
        //input in radians
        double input = 1;
        double actual = sciFunction.calcSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcCoSine() {
        double expected = 0.87758256189;
        //input in radians
        double input = 0.5;
        double actual = sciFunction.calcCoSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcTangent() {
        double expected = 1.55740772465;
        //input in radians
        double input =1 ;
        double actual = sciFunction.calcTangent(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseSine() {
        double expected = 0.52359877559;
        //input in radians
        double input = 0.5;
        double actual = sciFunction.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseCosine() {
        double expected = 0;
        //input in radians
        double input = 1;
        double actual = sciFunction.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseTangent() {
        double expected = 1.10714871779;
        //input in radians
        double input = 2;
        double actual = sciFunction.calcInverseTangent(input);
        Assertions.assertEquals(expected, actual);
    }
}