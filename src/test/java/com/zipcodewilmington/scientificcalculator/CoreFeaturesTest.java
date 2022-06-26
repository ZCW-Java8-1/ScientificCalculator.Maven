package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoreFeaturesTest {

    CoreFeatures allTests = new CoreFeatures();


    @Test
    void subtractTest() {
        double subT = allTests.subtract(5, 10);
        Assertions.assertEquals(-5.0, subT);
    }

    @Test
    void addTest() {
        double addT = allTests.add(5, 10);
        Assertions.assertEquals(15.0, addT);
    }

    @Test
    void multTest() {
        double multT = allTests.mult(5, 10);
        Assertions.assertEquals(50.0, multT);
    }

    @Test
    void divTest() {
        double divT = allTests.div(4, 6);
        Assertions.assertEquals(0, divT);
    }
}