package com.zipcodewilmington.scientific_calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;


/**
 * Created by leon on 2/9/18.
 */
public class testScientificFunc {
    private ScientificCalc objSciCalcTest;

    @Before
    public void setUp(){
        objSciCalcTest = new ScientificCalc ();}

    @Test
    public void testCos(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.cos(randomNum);
        double result = objSciCalcTest.cosine(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testSine(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.sin(randomNum);
        double result = objSciCalcTest.sine(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testTan(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.tan(randomNum);
        double result = objSciCalcTest.tangent(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvSine(){
        double randomNum = Math.random();
        double expectedResult = Math.asin(randomNum);
        double result = objSciCalcTest.invSine(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvCos(){
        double randomNum = Math.random();
        double expectedResult = Math.acos(randomNum);
        double result = objSciCalcTest.invCosine(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvTan(){
        double randomNum = Math.random();
        double expectedResult = Math.atan(randomNum);
        double result = objSciCalcTest.invTangent(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testLog(){
        double randomNum = (Math.random()*10);
        double expectedResult = Math.log(randomNum);
        double result = objSciCalcTest.log(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testinvLog(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.log10(randomNum);
        double result = objSciCalcTest.invLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testlnFunc(){
        double randomNum = (Math.random() * 10);
        //I don't know if this is the right math method
        double expectedResult = Math.log(1, randomNum);
        double result = objSciCalcTest.invLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testinvLnFunc(){
        double randomNum = (Math.random() * 10);
        //I don't know if this is the right math method
        double expectedResult = Math.log1p(1, randomNum);
        double result = objSciCalcTest.invLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testMemoryStoreDefault(){
        Assertions.assertEquals(0,calcMemoryMethodDefault)
//        (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
//        (MC key) Reset memory *
//        (MRC key) Recall the current value from memory to the display
    }

    @Test
    public void testSwitchDisplayMode(){
            Assertions.assertEquals(boolean, octal, float, double)
        }

//    Switch trig units mode (Degrees, Radians)
    switchUnitsMode() should rotate through the options
    switchUnitsMode(String mode) should set the trig units to the type given



    Factorial function



}
