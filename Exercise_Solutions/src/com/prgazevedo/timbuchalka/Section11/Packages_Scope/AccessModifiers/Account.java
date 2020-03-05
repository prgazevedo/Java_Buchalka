package com.prgazevedo.timbuchalka.Section11.Packages_Scope.AccessModifiers;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance=0;
    public ArrayList<Integer> transactionList;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactionList = new ArrayList<>();
        System.out.println("Account has been created for customer: "+accountName);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit){
        if(deposit>0){
            transactionList.add(deposit);
            balance+=deposit;
            System.out.println("Deposit of: "+deposit+" balance is now: "+this.getBalance());
        } else System.out.println("Deposit must be positive");
    }

    public void withdrawal(int withdrawal){
        if(withdrawal<0){
            transactionList.add(withdrawal);
            balance+=withdrawal;
            System.out.println("Withdrawal of: "+withdrawal+" balance is now: "+this.getBalance());
        } else System.out.println("Withdrawal must be negative");
    }

    public void calculateBalance(){
        int checkBalance=0;
        for (Integer i:transactionList){
            checkBalance+=i;
        }
        System.out.println("The calculated balance is: "+checkBalance);
        System.out.println("The Account balance is: "+balance);

        if(checkBalance!=balance){
            System.out.println("Account problem -> calculated balance differs from account balance");
        } else System.out.println("Account balance -> OK");
    }

}
