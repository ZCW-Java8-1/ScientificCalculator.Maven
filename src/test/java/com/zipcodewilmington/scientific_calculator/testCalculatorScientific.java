package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalculatorScientific;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by leon on 2/9/18.
 */
public class testCalculatorScientific {

    @Test
    public void testSci() {
        //given
        double value = 300;
        double expected = -0.9997558399011495;
        //when
        double actual = CalculatorScientific.sine(value);
        //then
        Assert.assertEquals(expected, actual);




    }







}
