package com.prgazevedo.timbuchalka.Section11.Packages_Scope;


public class Main {


    public static void main(String[] args) {

       // testMyWindow();
        testScopeCheck();
    }

    private static void testMyWindow() {
        MyWindow myWindow = new MyWindow("Hello World Window");
        myWindow.setVisible(true);
        myWindow.repaint();

    }

    private static void testScopeCheck(){
        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("ScopeCheck multiplication faction is: "+scopeCheck.getMultiplicationFactor());
        scopeCheck.printMultiplication(10);
        //Notice the weird instantiation of an inner class
        ScopeCheck.InnerClass scopeCheckInner = scopeCheck.new InnerClass();
        scopeCheckInner.setSumFactor(3);
        scopeCheckInner.printInnerSum(10);
        scopeCheckInner.printOuterSum(10);
    }

}
