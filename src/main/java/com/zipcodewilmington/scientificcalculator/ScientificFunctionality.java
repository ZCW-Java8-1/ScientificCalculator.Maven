package com.zipcodewilmington.scientificcalculator;


public class ScientificFunctionality {
    //TODO create another String instance variable to set display mode just like unitsMode

   //Instance variables
    private String unitsMode;
    private String displayMode;

    // Creating a constructor so that units mode MUST be set
    public ScientificFunctionality(){
        unitsMode = "Degrees";
    }

    //Logarithmic functions
    public Double calcLog(double input){
        return Math.log10(input);
    }
    public Double calcInverseLog(double input){
        return Math.pow(10,input);
    }
    public Double calcNaturalLog(double input){
        return Math.log(input);
    }
    public Double calcInverseNaturalLog(double input){
        return Math.exp(input);
    }

    //Trig Functions
    public Double calcSine(double input) {
        // if my units are degrees convert to radians then return answer
        // Because Math trig functions only take radians not degrees
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.sin(input);
    }
    public Double calcCoSine(double input){
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.cos(input);
    }
    public Double calcTangent(double input){
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.tan(input);
    }
    public Double calcInverseSine(double input){
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.asin(input);
    }
    public Double calcInverseCosine(double input){
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.acos(input);
    }
    public Double calcInverseTangent(double input){
        if(unitsMode.equals("Degrees")){
            input = Math.toRadians(input);
        }
        return Math.atan(input);
    }
    //Memory functions


    //switch units functions
    public String switchUnitsMode(){
       if(unitsMode.equals("Degrees")){
           unitsMode = "Radians";
       } else {
           unitsMode = "Degrees";
       }
        return unitsMode;
    }
    public String switchUnitsMode(String mode){
        if(mode.equals("Degrees") || mode.equals("Radians")) {
            unitsMode = mode;
        } else{
            System.out.println("Invalid units mode, setting units mode to Degrees");
            unitsMode = "Degrees";
        }
        return unitsMode;
    }
    public String getUnitsMode(){
        return unitsMode;;
    }

    //switch display mode
    public String switchDisplayMode(){
        if(displayMode.equals("Binary")){
            displayMode = "Octal";
        } else if(displayMode.equals("Octal")){
            displayMode = "Decimal";
        } else if(displayMode.equals("Decimal")){
            displayMode = "Hexadecimal";
        } else if(displayMode.equals("Hexadecimal")){
            displayMode = "Binary";
        }
        return displayMode;
    public String switchDisplayMode(String mode){
        displayMode = mode;
        }
}
