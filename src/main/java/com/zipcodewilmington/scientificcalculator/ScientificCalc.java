package com.zipcodewilmington.scientificcalculator;

enum TrigUnit {
    DEGREES("DEG"),
    RADIANS("RAD");

    String abbrev;

    private TrigUnit(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAbbrev() {
        return abbrev;
    }
    protected TrigUnit nextMode() {
        if (this.name() == "DEGREES") {
            return RADIANS;
        } else {
            return DEGREES;
        }
    }

}

public class ScientificCalc extends Calculations {
    protected CalcDisplayMode mode;
    private double memory;
    private TrigUnit trigUnit;

    public ScientificCalc() {
        this.memory = 0;
        this.mode = CalcDisplayMode.DECIMAL;
        this.trigUnit = TrigUnit.DEGREES;
    }

    protected void switchDisplayMode() {
        setDisplayMode(CalcDisplayMode.getModeByNum(mode.nextMode()));
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

    protected void switchUnitsMode() {
        trigUnit = trigUnit.nextMode();
    }

    protected void switchUnitsMode(String mode) {
        trigUnit = TrigUnit.valueOf(mode);
    }

    public String getDisplayMode() {
        return mode.getAbbrev();
    }
    public void setDisplayMode(CalcDisplayMode mode) {
        this.mode = mode;
    }

    public String getTrigMode() {
        return trigUnit.name();
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double x) {
        this.memory = x;
    }

    private double convertRadTrigUnit(double x) {
        if (getTrigMode() == "DEGREES") {
            return Math.toRadians(x);
        }
        return x;
    }

    private double convertDegTrigUnit(double x) {
        if (getTrigMode() == "RADIANS") {
            return Math.toDegrees(x);
        }
        return x;
    }

    public double sin(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.sin(convertedNum));
    }

    public double cos(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.cos(convertedNum));
    }

    public double tan(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.tan(convertedNum));
    }

    public double invSin(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.asin(convertedNum));
    }

    public double invCos(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.acos(convertedNum));
    }

    public double invTan(double x) {
        double convertedNum = convertDegTrigUnit(x);
        return convertDegTrigUnit(Math.atan(convertedNum));
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

    public static double factorial(double x) {
        double product = 1;
        for (double i = x; i > 0; i--) {
            product *= i;
        }
        return product;
    }

}
