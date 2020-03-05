package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.AccessModifiers;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        testPassword();
        //testClassWithIdentifier();
        //testStaticTest();
        //testAccount();
    }

    private static void testPassword() {
        Password password = new Password("test123");
        System.out.println("Enter password:");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            password.letMeIn(scanner.nextLine());
        }

    }

    private static void testClassWithIdentifier() {
        ClassWithIdentifier one = new ClassWithIdentifier("one");
        System.out.println("Object Nr: "+ClassWithIdentifier.getClassCounter()+" has identifier: "+ one.getClassIdentifier());
        ClassWithIdentifier two = new ClassWithIdentifier("two");
        System.out.println("Object Nr: "+ClassWithIdentifier.getClassCounter()+" has identifier: "+ two.getClassIdentifier());
    }

    private static void testStaticTest() {
        //since the numberofInstances is static it will be shared between the instances (belongs to the class)
        StaticTest one = new StaticTest("one instance");
        System.out.println("Created instance of StaticTest: "+one.getName()+" Number of instances is: "+one.getNumInstances());
        StaticTest two = new StaticTest("two instance");
        System.out.println("Created instance of StaticTest: "+two.getName()+" Number of instances is: "+two.getNumInstances());
        StaticTest three = new StaticTest("three instance");
        //notice the weird call to previous class
        System.out.println("Created instance of StaticTest: "+three.getName()+" Number of instances is: "+two.getNumInstances());
        //the correct way to implement is to make getNumInstances a static method
        System.out.println("Static call to Number of instances is: "+StaticTest.staticGetNumInstances());

    }

    private static void testAccount() {
        Account account = new Account("Dave");
        account.deposit(100);
        account.deposit(-10);
        account.withdrawal(-10);
        account.calculateBalance();

        //Access problems
        System.out.println("Outsider has set balance to 100");
        account.balance=100;
        account.calculateBalance();
        System.out.println("Outsider has set balance to 90");
        account.balance=90;
        account.calculateBalance();
        System.out.println("Outsider has added transaction to 100");
        account.transactionList.add(+100);
        account.calculateBalance();
    }



}
