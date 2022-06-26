package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    void TestMain() {
        ScientificFeatures inverseTest = new ScientificFeatures();
        double inverseT = inverseTest.inverse(0);
        Assertions.assertEquals("Err",inverseT);

    }

}
