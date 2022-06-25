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
    void TestCos() {
        ScientificFeatures cosineTest = new ScientificFeatures();
        double cosineT = cosineTest.cos(5);
        Assertions.assertEquals(0.9961946980917455,cosineT);

    }

    @Test
    void TestTan() {
        ScientificFeatures tanTest = new ScientificFeatures();
        double tanT = tanTest.tan(5);
        Assertions.assertEquals(0.087488663525924, tanT);
    }

    @Test
    void TestInverseSine() {
        ScientificFeatures inverseSineTest = new ScientificFeatures();
        double inverseSineT = inverseSineTest.inverseSine(50,110);
        Assertions.assertEquals(0.47186183727964187, inverseSineT);
    }

    @Test
    void TestInverseCosine() {
        ScientificFeatures inverseCosineTest = new ScientificFeatures();
        double inverseCosineT = inverseCosineTest.inverseCosine(50,110);
        Assertions.assertEquals(1.0989344895152549,inverseCosineT);
    }

    @Test
    void TestInverseTangent() {
        ScientificFeatures inverseTangetTest = new ScientificFeatures();
        double inverseTangentT = inverseTangetTest.inverseTangent(50,110);
        Assertions.assertEquals(0.4266274931268761, inverseTangentT);
    }

    @Test
    void TestFactorial() {
        ScientificFeatures factorialTest = new ScientificFeatures();
        double factorialT = factorialTest.factorial(5);
        Assertions.assertEquals(120, factorialT);
    }

    @Test
    void TestLog() {
        ScientificFeatures logTest = new ScientificFeatures();
        double logT = logTest.log(5);
        Assertions.assertEquals(0.6989700043360189, logT);

    }

    @Test
    void TestInverseLog() {
        ScientificFeatures inverseLogTest = new ScientificFeatures();
        double inverseLogT = inverseLogTest.inverseLog(5);
        Assertions.assertEquals(100000.0, inverseLogT);
    }

    @Test
    void TestLn() {
        ScientificFeatures naturalLogTest = new ScientificFeatures();
        double naturalLogT = naturalLogTest.ln(5);
        Assertions.assertEquals(0,naturalLogT);

    }

    @Test
    void inverseLn() {
    }




}