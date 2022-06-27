
package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.ScientificFunctionality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestScientificFunctionality {

    ScientificFunctionality sciFunction = new ScientificFunctionality();
    @Test
    public void testCalcLog() {
        double expected = 0.6020599913279624;
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
        double expected = 1.6094379124341003;
        double input = 5;
        double actual = sciFunction.calcNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseNaturalLog() {

        double expected = 20.085536923187668;
        double input = 3;
        double actual = sciFunction.calcInverseNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSine() {
        double expected = 0;
        //input in radians
        double input = 0;
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
        double expected = 0.54630248984;
        //input in radians
        double input =0.5;
        double actual = sciFunction.calcTangent(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseSine() {
        double expected = 0;
        //input in radians
        double input = 0;
        double actual = sciFunction.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseCosine() {
        double expected = 1.5707963267948966;
        //input in radians
        double input = 0;
        double actual = sciFunction.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseTangent() {
        double expected = 0.78539816339;
        //input in radians
        double input = 1;
        double actual = sciFunction.calcInverseTangent(input);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSwitchUnitsMode(){
        String expected = "Degrees";

    }

}
