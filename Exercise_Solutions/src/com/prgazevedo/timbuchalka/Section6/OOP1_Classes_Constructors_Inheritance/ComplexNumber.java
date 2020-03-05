package com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber complexNumber){
        this.real+=complexNumber.getReal();
        this.imaginary+=complexNumber.getImaginary();
    }

    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        this.real-=complexNumber.getReal();
        this.imaginary-=complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
}
