package com.Section6;

public class BankAccount {

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public BankAccount() {
        this(1000,0.0,"default Name","default email",0000000);
    }

    //full ctor
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        //Direct access to the fields instead of using the setters - at Ctor time the rest of code might not ne initialized yet
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //alternative partial ctor
    public BankAccount(String customerName, String email, int phoneNumber){
        this(1000, 0.0, customerName, email, phoneNumber);
    }

    public boolean depositFunds(double depositValue){
        if(depositValue>0){
            setBalance(getBalance()+depositValue);
            System.out.println("Account balance increased by: "+depositValue+ " new Balance is: "+getBalance());
            return true;
        }
        else{
            System.out.println("Account balance unchanged. Deposit must be positive");
            return false;
        }
    }

    public boolean withdrawFunds(double withdrawValue){
        if(withdrawValue>0 && withdrawValue<balance){
            setBalance(getBalance()+withdrawValue);
            System.out.println("Account balance decreased by: "+withdrawValue + " new Balance is: "+getBalance());
            return true;
        }
        else if(withdrawValue<0){
            System.out.println("Account balance unchanged. Withdrawal must be positive");
            return false;
        }
        else if(withdrawValue>balance){
            System.out.println("Account balance unchanged. Withdrawal must be lower than balance");
            return false;
        }
        System.out.println("withdrawFunds should not reach here");
        return false;
    }

}
