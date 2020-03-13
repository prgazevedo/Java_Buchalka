package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting.JUnit;

/**
 * Created by timbuchalka on 20/11/16.
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public boolean isChecking() {
        return (this.accountType==TYPE_ACCOUNT.CHECKING);
    }

    public enum TYPE_ACCOUNT { CHECKING,SAVINGS; }
    private TYPE_ACCOUNT accountType;

    public BankAccount(String firstName, String lastName, double balance, TYPE_ACCOUNT accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;

    }



    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        if(amount>500 && !branch) throw new IllegalArgumentException();
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
    public TYPE_ACCOUNT getAccountType() { return accountType; }
    // More methods that use firstName, lastName, and perform other functions

}
