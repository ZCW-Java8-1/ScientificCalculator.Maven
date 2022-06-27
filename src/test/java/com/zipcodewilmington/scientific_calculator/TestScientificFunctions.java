package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificCalc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by leon on 2/9/18.
 */
public class TestScientificFunctions {
    private ScientificCalc objSciCalcTest;

    @Before
    public void setUp(){
        objSciCalcTest = new ScientificCalc ();}

    @Test
    public void testCos(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.cos(randomNum);
        double result = objSciCalcTest.cos(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testCosHard(){
        objSciCalcTest = new ScientificCalc ();
        double num1 = 1;
        double expectedResult = Math.cos(1);
        double result = objSciCalcTest.cos(1);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testSine(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.sin(randomNum);
        double result = objSciCalcTest.sin(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testTan(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.tan(randomNum);
        double result = objSciCalcTest.tan(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvSine(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = Math.random();
        double expectedResult = Math.asin(randomNum);
        double result = objSciCalcTest.invSin(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvCos(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = Math.random();
        double expectedResult = Math.acos(randomNum);
        double result = objSciCalcTest.invCos(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testInvTan(){
        objSciCalcTest = new ScientificCalc ();
        double randomNum = Math.random();
        double expectedResult = Math.atan(randomNum);
        double result = objSciCalcTest.invTan(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testLog(){
        double randomNum = (Math.random()*10);
        double expectedResult = Math.log10(randomNum);
        double result = objSciCalcTest.log(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testinvLog(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.pow(10, randomNum);
        double result = objSciCalcTest.invLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testlnFunc(){
        double randomNum = (Math.random() * 10);
        double expectedResult = Math.log(randomNum);
        double result = objSciCalcTest.natLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }

    @Test
    public void testinvLnFunc(){
        double randomNum = (Math.random() * 10);
        //I don't know if this is the right math method
        double expectedResult = Math.pow(Math.E, randomNum);
        double result = objSciCalcTest.invNatLog(randomNum);
        Assert.assertEquals(expectedResult,result,0.000000d);
    }
    @Test
    public void abs(){
        double testNum = 8;
        double expectedResult = (Math.abs(testNum));
        double result = objSciCalcTest.abs(testNum);
        Assert.assertEquals(expectedResult, result, 0.00000000d);
    }

    @Test
    public void factorial(){
        long testNum = 8;
        long expectedResult = 40320;
        long result = objSciCalcTest.factorial(testNum);
        Assert.assertEquals(expectedResult, result, 0.00000000d);
    }

    @Test
    public void factorialFail(){
        long testNum = 8;
        long expectedResult = 94032;
        long result = objSciCalcTest.factorial(3);
        Assert.assertNotEquals(expectedResult, result);
    }
    @Test
    public void Pi(){
        long expectedResult = (long) Math.PI;
        long result = (long) objSciCalcTest.pi();
        Assert.assertEquals(expectedResult, result, 0.00000000d);
    }

//    @Test
//    public void testMemoryStoreDefault(){
//        Assertions.assertEquals(0,calcMemoryMethodDefault);
//        (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
//        (MC key) Reset memory *
//        (MRC key) Recall the current value from memory to the display
    }

  //  @Test
  //  public void testSwitchDisplayMode(){
  //          Assertions.assertEquals(boolean, octal, float, double)
  //      }

//    Switch trig units mode (Degrees, Radians)
 //   switchUnitsMode() should rotate through the options
  //  switchUnitsMode(String mode) should set the trig units to the type given







