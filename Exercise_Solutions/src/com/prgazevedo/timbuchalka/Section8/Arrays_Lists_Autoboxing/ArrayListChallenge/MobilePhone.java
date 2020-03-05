package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing.ArrayListChallenge;

import java.util.Scanner;

public class MobilePhone {

    private ContactManager CM;
    private static Scanner scanner;


    public MobilePhone(Scanner input) {
        CM = new ContactManager();
         scanner = input;
    }


    public boolean readOptions() {
        showOptions();
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                return true;
            case "2":
                if(CM.storeContact()) System.out.println("Contact stored");
                else System.out.println("Contact not stored - already exists");
                return true;
            case "3":
                if(CM.modifyContact())  System.out.println("Contact modified");
                else System.out.println("Contact not modified - does not exist");
                return true;
            case "4":
                if(CM.queryContact()) System.out.println("Contact exists");
                else System.out.println("Contact does not exist");
                return true;
            case "5":
                if(CM.removeContact()) System.out.println("Contact removed");
                else System.out.println("Contact not removed - does not exists");
                return true;
            case "6":
                CM.showContacts() ;
                System.out.println("All contacts presented");
                return true;
            case "7":
                System.out.println("Exit");
                return CM.quit();
            default:
                System.out.println("Error. Exiting");
                return false;

        }
    }



    public static void showOptions() {
        System.out.println("Mobile Phone options:");
        System.out.println("1 - Present options");
        System.out.println("2 - Add contact");
        System.out.println("3 - Modify contact");
        System.out.println("4 - Query/Find contact");
        System.out.println("5 - Remove contact");
        System.out.println("6 - Show all contacts");
        System.out.println("7 - Quit");
        System.out.println("Please select an option:");
    }

    public static Contact queryUserForContact(){
        System.out.println("Enter contact:");
        System.out.println("1-Node:");
        Contact userContact= new Contact();
        userContact.setName(scanner.nextLine());
        System.out.println("2-Phone number:");
        userContact.setPhoneNumber(scanner.nextLine());
        return  userContact;

    }



    public void run() {
        System.out.println("Mobile Phone Running");
        while(this.readOptions());
        System.out.println("Mobile Phone Exiting");
    }
}


