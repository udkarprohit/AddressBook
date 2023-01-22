package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address BookProgram");

        /*calling non-static method
        or object-level method */
        addressBook.addContacts();

        System.out.println("*******************");
        //getting the values of users(get method)
        System.out.println("First Name : " + addressBook.contacts.getFirstName());
        System.out.println("Last Name : " + addressBook.contacts.getLastName());
        System.out.println("Address : " + addressBook.contacts.getAddress());
        System.out.println("City Name : " + addressBook.contacts.getCityName());
        System.out.println("State Name : " + addressBook.contacts.getStateName());
        System.out.println("Zip Code : " + addressBook.contacts.getZipCode());
        System.out.println("Phone Number : " + addressBook.contacts.getPhoneNumber());
        System.out.println("Email : " + addressBook.contacts.getEmail());

        //Editing users data method call
        addressBook.editUser();
        System.out.println("*******************");
        System.out.println("First Name : " + addressBook.contacts.getFirstName());
        System.out.println("Last Name : " + addressBook.contacts.getLastName());
        System.out.println("Address : " + addressBook.contacts.getAddress());
        System.out.println("City Name : " + addressBook.contacts.getCityName());
        System.out.println("State Name : " + addressBook.contacts.getStateName());
        System.out.println("Zip Code : " + addressBook.contacts.getZipCode());
        System.out.println("Phone Number : " + addressBook.contacts.getPhoneNumber());
        System.out.println("Email : " + addressBook.contacts.getEmail());

    }
}
