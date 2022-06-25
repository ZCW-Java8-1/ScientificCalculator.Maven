package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestScientificFeatures extends ScientificFeatures {

    @Test
    void testSquare() {
        ScientificFeatures PaydayTest = new ScientificFeatures();
        double something = PaydayTest.square(5);
        Assertions.assertEquals(25.0, something);
    }

    @Test
    void testSquareRoot() {
    }

    @Test
    void testSwitchSign() {
    }

    @Test
    void testInverse() {
    }

    @Test
    void testSine() {
    }

    @Test
    void testCos() {
    }

    @Test
    void testTan() {
    }

    @Test
    void testInverseSine() {
    }

    @Test
    void testInverseCosine() {
    }

    @Test
    void testInverseTangent() {
    }

    @Test
    void testFactorial() {
    }

    @Test
    void testLog() {
    }

    @Test
    void testInverseLog() {
    }

    @Test
    void testLn() {
    }

    @Test
    void testInverseLn() {
    }
}