package com.zipcodewilmington.scientificcalculator;

public enum CalcDisplayMode {
    DECIMAL(1),
    BINARY(2),
    HEXADECIMAL(3),
    OCTAL(4);

    int modeNum;

    CalcDisplayMode(int modeNum) {
        this.modeNum = modeNum;
    }

    public int getModeNum() {
        return modeNum;
    }

    public int nextMode() {
        if (modeNum == 4) {
            return this.DECIMAL.modeNum;
        }
        return modeNum++;
    }

    public static CalcDisplayMode getModeByNum(int num) {
        for (CalcDisplayMode mode : values()) {
            if (mode.modeNum == num) {
                return mode;
            }
        }
        return null;
    }
}