package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.jupiter.api.Assertions;

public class ScientificFeaturesTest extends ScientificFeatures {
    @org.junit.jupiter.api.Test
    void SquareTest() {
        ScientificFeatures PaydayTest = new ScientificFeatures();
        double something = PaydayTest.square(5);
        Assertions.assertEquals(25.0, something);
    }
}
