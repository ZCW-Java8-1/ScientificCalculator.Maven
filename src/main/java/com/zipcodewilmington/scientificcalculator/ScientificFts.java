package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScientificFts {
    public String switchDisplayMode(int num) {
        DecimalFormat df = new DecimalFormat("0.00");

        String binary = (Integer.toBinaryString(num));
        String octal = (Integer.toOctalString(num));
        String decimal = (df.format(num));
        String hexadecimal = (Integer.toHexString(num));

//        check for keyboard input
//        cycle through methods
//        to return binary, octal, decimal, hexidecimal
        String res = (binary + " " + octal + " " + decimal + " " + hexadecimal);
        return res;

    }
}
