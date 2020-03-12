package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests using JUnit
 * -Assure JUnit is installed
 * -Alt-Enter over the class Name -> generate test
 * -Correct errors by allowing auto import of libraries
 * - add fails and asserts
 * -Either run all tests by changing context to the Test class
 * -Run each test
 */

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
//        fail("This test is yet to be implemented");
        BankAccount account = new BankAccount("Me","Last Name",1000, BankAccount.TYPE_ACCOUNT.CHECKING);
        double balance = account.deposit(200,true);
        /**
         * The delta parameter is to allow some leeway in the return value: balance
         */
        assertEquals(1200,balance,0);
        assertEquals(1200,account.getBalance(),0);
    }


    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test is yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Me","Last Name",1000,BankAccount.TYPE_ACCOUNT.CHECKING);
        account.deposit(200,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdrawal() {
        BankAccount account = new BankAccount("Me","Last Name",1000,BankAccount.TYPE_ACCOUNT.CHECKING);
        account.withdraw(200,true);
        assertEquals(800,account.getBalance(),0);
    }

    @Test
    void isChecking_true() {
        BankAccount account = new BankAccount("Me","Last Name",1000,BankAccount.TYPE_ACCOUNT.CHECKING);
        assertTrue(account.isChecking(), "The account is not checking account");
    }

    //    @org.junit.jupiter.api.Test
//    public void dummyTest(){
//        assertEquals(20,21);
//    }
}