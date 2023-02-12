package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    static Scanner scanner = new Scanner(System.in);
    static AddressBook addressBook = new AddressBook();
    static Contacts contacts;

    public static void main(String[] args) {

        System.out.println("Welcome to Address BookProgram");

        while (true) {
            System.out.println("Address Book Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View Address Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> addressBook.showAddressBook();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid option, please try again");
            }
        }
    }

    static void addContact() {
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
        contacts = new Contacts(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, email);
        addressBook.addContact(contacts);
        contacts.setFirstName(firstName);
        contacts.setLastName(lastName);
        contacts.setAddress(address);
        contacts.setCityName(cityName);
        contacts.setStateName(stateName);
        contacts.setZipCode(zipCode);
        contacts.setPhoneNumber(phoneNumber);
        contacts.setEmail(email);
        System.out.println("Contact added successfully");
    }

    static void editContact() {
//        Contacts contacts;
        System.out.print("Enter name to edit: ");
        String fName = scanner.nextLine();
        Contacts contactToEdit = addressBook.findContact(fName);
        if (contactToEdit == null) {
            System.out.println("Contact not found");
            return;
        }
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
        addressBook.editContact(contactToEdit, firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, email);
//        assert false;
        contacts.setFirstName(fName);
        contacts.setLastName(lastName);
        contacts.setAddress(address);
        contacts.setCityName(cityName);
        contacts.setStateName(stateName);
        contacts.setZipCode(zipCode);
        contacts.setPhoneNumber(phoneNumber);
        contacts.setEmail(email);
        System.out.println("Contact edited successfully");
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String deleteName = scanner.nextLine();
        Contacts contactToDelete = addressBook.findContact(deleteName);
        if (contactToDelete == null) {
            System.out.println("Contact not found");
            return;
        }
        addressBook.deleteContact(contactToDelete);
        System.out.println("Contact deleted successfully");
    }
}
