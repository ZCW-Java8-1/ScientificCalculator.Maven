package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificFeaturesTest extends Console {

    @Test
    void TestSquare() {
        ScientificFeatures squareTest = new ScientificFeatures();
        double squareT = squareTest.square(5);
        Assertions.assertEquals(25.0, squareT);
    }

    @Test
    void TestSquareRoot() {
        ScientificFeatures squareRootTest = new ScientificFeatures();
        double squareT = squareRootTest.squareRoot(25);
        Assertions.assertEquals(5.0, squareT);
    }

    @Test
    void TestSwitchSign() {
        ScientificFeatures switchSignSwitch = new ScientificFeatures();
        double switchSignT = switchSignSwitch.switchSign(5);
        Assertions.assertEquals(-5,switchSignT);

    }

    @Test
    void TestInverse() {
        ScientificFeatures inverseTest = new ScientificFeatures();
        double inverseT = inverseTest.inverse(4);
        Assertions.assertEquals(0.25,inverseT);
        //Come back to this
    }

    @Test
    void TestSine() {
        ScientificFeatures sineTest = new ScientificFeatures();
        double sineT = sineTest.sine(5);
        Assertions.assertEquals(0.08715574274765817, sineT);
    }

    @Test
    void cos() {

    }

    @Test
    void tan() {
    }

    @Test
    void inverseSine() {
    }

    @Test
    void inverseCosine() {
    }

    @Test
    void inverseTangent() {
    }

    @Test
    void factorial() {
    }

    @Test
    void log() {
    }

    @Test
    void inverseLog() {
    }

    @Test
    void ln() {
    }

    @Test
    void inverseLn() {
    }


//        ScientificFeatures PaydayTest = new ScientificFeatures();
//        double something = PaydayTest.DividebyZero(5,0);
//        Assertions.assertEquals("infinity", something);


}