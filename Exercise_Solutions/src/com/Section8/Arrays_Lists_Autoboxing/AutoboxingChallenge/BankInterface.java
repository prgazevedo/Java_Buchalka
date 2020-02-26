package com.Section8.Arrays_Lists_Autoboxing.AutoboxingChallenge;

import java.util.Scanner;

class BankInterface {

    private Scanner scanner;
    private Bank bank;

    public BankInterface(Bank bank) {
        this.bank = bank;
        this.scanner = new Scanner(System.in);
        System.out.println("Bank Interface started:");
    }

    public void runBankInterface(){


        while(processBankOptions());
    }

    public void presentBankOptions(){
        System.out.println("Bank options:");
        System.out.println("1-Add Branch");
        System.out.println("2-Remove Branch");
        System.out.println("3-Select Branch options");
        System.out.println("4-List Branches and Customers");
        System.out.println("5-List Options again");
        System.out.println("6-Exit");
    }

    public boolean processBankOptions(){
        presentBankOptions();
        String branchName="";
        if(!scanner.hasNextInt()) {
            System.out.println("Please enter a choice number!");
            return true;
        }
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Selected 1-Add Branch");
                branchName += inputBranchName();
                if(bank.addNewBranch(branchName)) System.out.println("Branch added");
                return true;
            case 2:
                System.out.println("Selected 2-Remove Branch");
                branchName += inputBranchName();
                if(bank.removeBranch(branchName)) System.out.println("Branch removed");;
                return true;
            case 3:
                System.out.println("Selected 3-Branch Options");
                branchName += inputBranchName();
                presentBranchOptions();
                processBranchOptions(branchName);
                return true;
            case 4:
                System.out.println("Selected 4-List Branches and Customers");
                System.out.println(bank.getBranchAndCustomerListString());
                return true;
            case 5:
                System.out.println("Selected 5-List Options again");
                return true;
            case 6:
                System.out.println("Selected 6-Exit");
                return false;

        }
        return false;
    }

    public boolean processBranchOptions(String branchName) {
        Branch b=bank.getBranch(branchName);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Selected 1-Add Customer");
                b.addCustomer(getCustomerName());
                return true;
            case 2:
                System.out.println("Selected 2-List Customers");
                System.out.println( b.getCustomerListString());
                return true;
            case 3:
                System.out.println("Selected 3-List Customers and Transactions");
                System.out.println( b.getCustomerAndTransactionListString());
                return true;
            case 4:
                System.out.println("Selected 4-Add Customer transaction");
                presentCustomerOptions();
                processUserTransactions(b);
                return false;
            case 5:
                System.out.println("Selected 5-Exit");
                return false;
            default:
                return true;
        }
    }

    public void processUserTransactions(Branch b){
        String userName = getCustomerName();
        System.out.println("Transaction: ");
        while(scanner.hasNextDouble()){
            Double transaction = scanner.nextDouble();
            b.addCustomerTransaction(userName, transaction);
            System.out.println("Transaction: ");
        }
        System.out.println("No more transactions to add.");

    }

    private String inputBranchName(){
        System.out.println("Enter branch name:");
        System.out.println("test");
        String branchName= scanner.nextLine();
        return branchName;
    }
    private String getCustomerName(){
        System.out.println("Enter customer name:");
        return scanner.nextLine();
    }
    public void presentBranchOptions(){
        System.out.println("Branch options:");
        System.out.println("1-Add Customer");
        System.out.println("2-List Customers");
        System.out.println("3-List Customers and Transactions");
        System.out.println("4-Add Customer transaction");
        System.out.println("5-Exit");
    }

    public void presentCustomerOptions(){
        System.out.println("Customer - add transactions ");
        System.out.println("(+ deposit /- withdrawal)");
        System.out.println("any non number to return");
    }


}
