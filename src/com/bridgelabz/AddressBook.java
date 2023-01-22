package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    //creating an instance variable of AddressBook class
    Contacts contacts = new Contacts();

    void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Address : ");
        String address = scanner.nextLine();
        System.out.print("Enter City Name : ");
        String cityName = scanner.nextLine();
        System.out.print("Enter State Name : ");
        String stateName = scanner.nextLine();
        System.out.print("Enter Zip Code : ");
        String zipCode = scanner.nextLine();
        System.out.print("Enter Phone Number : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email : ");
        String email = scanner.nextLine();
        //setting attributes values form users end.
        contacts.setFirstName(firstName);
        contacts.setLastName(lastName);
        contacts.setAddress(address);
        contacts.setCityName(cityName);
        contacts.setStateName(stateName);
        contacts.setZipCode(zipCode);
        contacts.setPhoneNumber(phoneNumber);
        contacts.setEmail(email);
    }

    //non-static method for editing user data
    void editUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        if (firstName.equals(contacts.getFirstName())) {
            System.out.print("Enter First Name : ");
            String fName = scanner.nextLine();
            System.out.print("Enter Last Name : ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address : ");
            String address = scanner.nextLine();
            System.out.print("Enter City Name : ");
            String cityName = scanner.nextLine();
            System.out.print("Enter State Name : ");
            String stateName = scanner.nextLine();
            System.out.print("Enter Zip Code : ");
            String zipCode = scanner.nextLine();
            System.out.print("Enter Phone Number : ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email : ");
            String email = scanner.nextLine();
            contacts.setFirstName(fName);
            contacts.setLastName(lastName);
            contacts.setAddress(address);
            contacts.setCityName(cityName);
            contacts.setStateName(stateName);
            contacts.setZipCode(zipCode);
            contacts.setPhoneNumber(phoneNumber);
            contacts.setEmail(email);
        } else {
            System.out.println("Enter the correct details");
        }
    }

    //non-static method for deleting user data
    void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        if (firstName.equals(contacts.getFirstName())) {
            contacts.setFirstName(null);
            contacts.setLastName(null);
            contacts.setAddress(null);
            contacts.setCityName(null);
            contacts.setStateName(null);
            contacts.setZipCode(null);
            contacts.setPhoneNumber(null);
            contacts.setEmail(null);
        } else {
            System.out.println("Enter the correct details");
        }
    }
}
