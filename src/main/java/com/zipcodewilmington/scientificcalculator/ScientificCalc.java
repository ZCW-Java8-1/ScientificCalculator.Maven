package com.zipcodewilmington.scientificcalculator;

enum TrigUnit {
    DEGREES,
    RADIANS;

    protected TrigUnit nextMode() {
        if (this.name() == "DEGREES") {
            return RADIANS;
        } else {
            return DEGREES;
        }
    }

}

public class ScientificCalc {
    private CalcDisplayMode mode;
    private double memory;
    private TrigUnit trigUnit;

    public ScientificCalc() {
        this.memory = 0;
        this.mode = CalcDisplayMode.DECIMAL;
        this.trigUnit = TrigUnit.DEGREES;
    }

    protected void switchDisplayMode() {
        mode = CalcDisplayMode.getModeByNum(mode.nextMode());
    }

    protected void switchDisplayMode(String mode) {
        this.mode = CalcDisplayMode.valueOf(mode);
    }

    protected void mPlusKey() {}

    protected void mCKey() {
        memory = 0;
    }

    protected double mRCKey() {
        return memory;
    }

    private void switchUnitsMode() {
        trigUnit = trigUnit.nextMode();
    }

    private void switchUnitsMode(String mode) {
        trigUnit = TrigUnit.valueOf(mode);
    }



    public String getTrigMode() {
        return trigUnit.name();
    }

    private double convertTrigUnit(double x) {
        if (getTrigMode() == "DEGREES") {
            return Math.toRadians(x);
        }
        return x;
    }

    public double sin(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.sin(convertedNum);
    }

    public double cos(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.cos(convertedNum);
    }

    public double tan(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.tan(convertedNum);
    }

    public double invSin(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.asin(convertedNum);
    }

    public double invCos(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.acos(convertedNum);
    }

    public double invTan(double x) {
        double convertedNum = convertTrigUnit(x);
        return Math.atan(convertedNum);
    }

    public static double log(double x) {
        return Math.log10(x);
    }

    public static double invLog(double x) {
        return Math.pow(10, x);
    }

    public static double natLog(double x) {
        return Math.log(x);
    }

    public static double invNatLog(double x) {
        return Math.pow(Math.E, x);
    }

    public static double pi() {
        return Math.PI;
    }

    public static double abs(double x) {
        return Math.abs(x);
    }

    public static long factorial(long x) {
        long product = 1;
        for (long i = x; i > 0; i--) {
            product *= i;
        }
        return product;
    }

}
