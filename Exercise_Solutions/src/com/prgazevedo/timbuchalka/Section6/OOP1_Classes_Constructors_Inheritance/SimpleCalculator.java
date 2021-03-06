package com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance;

/**
 * Created by dev on 8/3/15.
 */
public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        return  firstNumber*secondNumber;
    }

    public double getDivisionResult(){
       if(this.secondNumber != 0) return firstNumber/secondNumber;
       else return 0;
    }
}
