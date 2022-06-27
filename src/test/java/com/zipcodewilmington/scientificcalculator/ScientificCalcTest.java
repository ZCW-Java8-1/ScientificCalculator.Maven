package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalcTest {

    @Test
    public void testFactorial() {
        ScientificCalc calc = new ScientificCalc();
        assertEquals(120, calc.factorial(5));
        assertEquals(3628800, calc.factorial(10));
    }
}
