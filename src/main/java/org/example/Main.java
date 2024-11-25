package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Grocery grocery = new Grocery();
//        grocery.startGrocery();

        MobilePhone mobilePhone = new MobilePhone("2135484231", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Orhan", "48846151354"));
        mobilePhone.addNewContact(new Contact("Orhan", "48846151354"));
        mobilePhone.addNewContact(new Contact("Orhan", "48846151354"));
        mobilePhone.addNewContact(new Contact("Emin", "8968435484"));
        mobilePhone.printContact();
    }
}
