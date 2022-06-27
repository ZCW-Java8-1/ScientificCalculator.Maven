package com.zipcodewilmington.scientificcalculator;

public enum CalcDisplayMode {
    DECIMAL(1, "DEC"),
    BINARY(2, "BIN"),
    HEXADECIMAL(3, "HEX"),
    OCTAL(4, "OCT");

    int modeNum;
    String abbrev;

    CalcDisplayMode(int modeNum, String abbrev) {
        this.modeNum = modeNum;
        this.abbrev = abbrev;
    }

    public int getModeNum() {
        return modeNum;
    }

    public String getAbbrev() {
        return abbrev;
    }
    public int nextMode() {
        if (this.modeNum == 4) {
            return this.DECIMAL.modeNum;
        }
        return this.modeNum + 1;
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