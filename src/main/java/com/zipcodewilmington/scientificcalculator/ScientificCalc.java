package com.zipcodewilmington.scientificcalculator;

enum TrigUnits {
    DEGREES, RADIANS;
}

public class ScientificCalc {
//    DisplayMode mode;
    double memory;

    public ScientificCalc() {
        super();
        this.memory = 0;
    }

    protected void switchDisplayMode() {}

    protected void switchDisplayMode(String mode) {}

    protected void mPlusKey() {}

    protected void mCKey() {
        memory = 0;
    }

    protected void mRCKey() {}

    protected void switchUnitsMode() {}

    protected void switchUnitsMode(String mode) {}

    public int factorial(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) {
            product *= i;
        }
        return product;
    }

}
