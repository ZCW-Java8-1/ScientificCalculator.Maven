package com.zipcodewilmington.scientificcalculator;


public class ScientificFunctionality {

    //Instance variables
    private String unitsMode;
    private String displayMode;

    private int decValue;
    private String binValue;

    private String octValue;

    private String hexValue;
    private String memValue;

    // Creating a constructor so that unit & display modes MUST be set
    public ScientificFunctionality(){
        unitsMode = "Degrees";
        displayMode = "Decimal";
    }

    //Logarithmic functions
    public Double calcLog(double input) {
        return Math.log10(input);
    }

    public Double calcInverseLog(double input) {
        return Math.pow(10, input);
    }

    public Double calcNaturalLog(double input) {
        return Math.log(input);
    }

    public Double calcInverseNaturalLog(double input) {
        return Math.exp(input);
    }

    //Trig Functions
    public Double calcSine(double input) {
        // if my units are degrees convert to radians then return answer
        // Because Math trig functions only take radians not degrees
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.sin(input);
    }

    public Double calcCoSine(double input) {
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.cos(input);
    }

    public Double calcTangent(double input) {
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.tan(input);
    }

    public Double calcInverseSine(double input) {
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.asin(input);
    }

    public Double calcInverseCosine(double input) {
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.acos(input);
    }

    public Double calcInverseTangent(double input) {
        if (unitsMode.equals("Degrees")) {
            input = Math.toRadians(input);
        }
        return Math.atan(input);
    }
    //Memory functions


    //switch units functions
    public String switchUnitsMode() {
        if (unitsMode.equals("Degrees")) {
            unitsMode = "Radians";
        } else {
            unitsMode = "Degrees";
        }
        return unitsMode;
    }

    public String switchUnitsMode(String mode) {
        if (mode.equals("Degrees") || mode.equals("Radians")) {
            unitsMode = mode;
        } else {
            System.out.println("Invalid units mode, setting units mode to Degrees");
            unitsMode = "Degrees";
        }
        return unitsMode;
    }

    public String getUnitsMode() {
        return unitsMode;
    }

    public void displayUnitsMode(){
        System.out.println(unitsMode);
    }

    //switch display mode functions
    // Should be used like switchDisplayMode THEN use
    // ConvertFromDecimal THEN getDisplayModeValue
    public String switchDisplayMode(){
        if(displayMode.equals("Binary")){
            displayMode = "Octal";
        } else if (displayMode.equals("Octal")) {
            displayMode = "Decimal";
        } else if (displayMode.equals("Decimal")) {
            displayMode = "Hexadecimal";
        } else if (displayMode.equals("Hexadecimal")) {
            displayMode = "Binary";
        }
        return displayMode;
    }

    public String switchDisplayMode(String mode) {
        if (mode.equals("Binary") || mode.equals("Octal") || mode.equals("Decimal") || mode.equals("Hexadecimal")) {
            displayMode = mode;
        } else {
            System.out.println("Invalid display mode, setting display mode to Decimal");
            displayMode = "Decimal";
        }
        return displayMode;
    }

    // Converting results to Decimal so that things can be computed
    public String getDisplayModeValue(){
        String result;

        if(displayMode.equals("Binary")){
            result = getBinValue();
        } else if(displayMode.equals("Octal")){
            result = getOctValue();
        } else if(displayMode.equals("Decimal")){
            result = String.valueOf(getDecValue());
        } else {
            result = getHexValue();
        }
        return result;
    }

    public void showDisplayModeValue(){
        String value = getDisplayModeValue();
        System.out.println(value);
    }

    public void convertFromDecimal(int input){
        binValue = Integer.toBinaryString(input);
        octValue = Integer.toOctalString(input);
        hexValue = Integer.toHexString(input);
        decValue = input;
    }

    public String storeMemoryValue(String value){
        memValue = value;
        return memValue;
    }

    public void clearMemoryValue(){
        memValue = null;
    }

    public String getMemoryValue(){
        return memValue;
    }

    public String getBinValue(){
        return binValue;
    }

    public String getOctValue(){
        return octValue;
    }

    public String getHexValue(){
        return hexValue;
    }

    public int getDecValue(){
        return decValue;
    }
}
