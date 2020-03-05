package com.prgazevedo.timbuchalka.Section8.Arrays_Lists_Autoboxing.ArrayListChallenge;

import java.util.ArrayList;

public class ContactManager {


    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactManager() {
    }

    public boolean storeContact() {
        Contact tentativeContact = MobilePhone.queryUserForContact();
        if(!contacts.contains(tentativeContact)){
            contacts.add(tentativeContact);
            return true;
        }else{
            return false;
        }

    }

    public boolean modifyContact() {
        Contact tentativeContact = MobilePhone.queryUserForContact();
        int index;
        if((index=contacts.indexOf(tentativeContact))!=-1){
            contacts.set(index,tentativeContact);
            return true;
        }else{
            return false;
        }

    }

    public boolean queryContact() {
        Contact tentativeContact = MobilePhone.queryUserForContact();
        return !contacts.contains(tentativeContact);
    }



    public boolean removeContact() {
        Contact tentativeContact = MobilePhone.queryUserForContact();
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
