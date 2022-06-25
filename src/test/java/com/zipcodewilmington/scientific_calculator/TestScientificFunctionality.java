package ScientificCalculator.Maven.src.test.java.com.zipcodewilmington.scientific_calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestScientificFunctionality {
    @Test
    public void testCalcLog() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseLog() {
        double expected = 1000;
        int input = 3;
        double actual = ScientificFunctionality.calcInverseLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcNaturalLog() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseNaturalLog() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcInverseNaturalLog(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcSine() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcCoSine() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcCoSine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcTangent() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcTangent(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseCosine() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseCosine() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcInverseCosine(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcInverseTangent() {
        double expected = 0.60205999132;
        int input = 4;
        double actual = ScientificFunctionality.calcInverseTangent(input);
        Assertions.assertEquals(expected, actual);
    }
}
