package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers;

public class ScopeCheck {
    private int Factor = 2;
    private String separator="=========================================";

    public ScopeCheck() {
    }

    public int getMultiplicationFactor() {
        return Factor;
    }

    public void setMultiplicationFactor(int multiplicationFactor) {
        this.Factor = multiplicationFactor;
    }

    public void printMultiplication(int maxNumber){
        System.out.println(separator);
        for (int i = 1; i < maxNumber; i++) {
            System.out.println("Multiplication of: "+i+" with factor: "+this.Factor+" has value:" +this.Factor*i);
        }
    }


    public class InnerClass{
        private int Factor = 3;

        public InnerClass() {

        }

        public int getSumFactor() {
            return Factor;
        }

        public void setSumFactor(int sumFactor) {
            this.Factor = sumFactor;
        }

        public void printInnerSum(int maxNumber){
            //notice the use of outer class private variable
            System.out.println(separator);
            for (int i = 1; i < maxNumber; i++) {
                System.out.println("Sum of: "+i+" with inner factor: "+this.Factor +" has value:" +(this.Factor+i));
            }
        }

        public void printOuterSum(int maxNumber){
            System.out.println(separator);
            for (int i = 1; i < maxNumber; i++) {
                System.out.println("Sum of: "+i+" with outer factor: "+ScopeCheck.this.Factor +" has value:" +(ScopeCheck.this.Factor+i));
            }
        }
    }
}
