package com.Section8.Arrays_Lists_Autoboxing;

import java.util.ArrayList;

import static com.Section8.Arrays_Lists_Autoboxing.MobilePhone.queryUserForContact;

public class ContactManager {


    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactManager() {
    }

    public boolean storeContact() {
        Contact tentativeContact = queryUserForContact();
        if(!contacts.contains(tentativeContact)){
            contacts.add(tentativeContact);
            return true;
        }else{
            return false;
        }

    }

    public boolean modifyContact() {
        Contact tentativeContact = queryUserForContact();
        int index;
        if((index=contacts.indexOf(tentativeContact))!=-1){
            contacts.set(index,tentativeContact);
            return true;
        }else{
            return false;
        }

    }

    public boolean queryContact() {
        Contact tentativeContact = queryUserForContact();
        return !contacts.contains(tentativeContact);
    }



    public boolean removeContact() {
        Contact tentativeContact = queryUserForContact();
        if(contacts.contains(tentativeContact)){
            contacts.remove(tentativeContact);
            return true;
        }else{
            return false;
        }
    }

    public void showContacts() {
        for (Contact contact: contacts) {
            System.out.println("Contact: "+contact.toString());

        }
    }

    public boolean quit() {
        System.out.println("Contact Manager shutdown");
        return false;
    }
}