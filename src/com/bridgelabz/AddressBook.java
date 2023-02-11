package com.bridgelabz;
import java.util.ArrayList;

public class AddressBook {

    //creating an instance variable of AddressBook class
//    Contacts contacts = new Contacts();
    ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts contact) {
        contacts.add(contact);
    }

    public Contacts findContact(String name) {
        for (Contacts contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(Contacts contact, String firstName, String lastName, String address, String cityName, String stateName, String zipCode, String phoneNumber, String email) {
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCityName(cityName);
        contact.setStateName(stateName);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
    }

    public void deleteContact(Contacts contact) {
        contacts.remove(contact);
    }

    public void showAddressBook() {
        for (Contacts contact : contacts) {
            System.out.println("Enter First Name : " + contact.getFirstName());
            System.out.println("Enter Last Name : " + contact.getLastName());
            System.out.println("Enter Address : " + contact.getAddress());
            System.out.println("Enter City Name : " + contact.getCityName());
            System.out.println("Enter State Name : " + contact.getStateName());
            System.out.println("Enter Zip Code : " + contact.getZipCode());
            System.out.println("Enter Phone Number : " + contact.getPhoneNumber());
            System.out.println("Enter Email : " + contact.getEmail());
        }
    }
}

//    void addContacts() {
//        ArrayList<String> arrayList  = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter First Name : ");
//        String firstName = scanner.nextLine();
//        System.out.print("Enter Last Name : ");
//        String lastName = scanner.nextLine();
//        System.out.print("Enter Address : ");
//        String address = scanner.nextLine();
//        System.out.print("Enter City Name : ");
//        String cityName = scanner.nextLine();
//        System.out.print("Enter State Name : ");
//        String stateName = scanner.nextLine();
//        System.out.print("Enter Zip Code : ");
//        String zipCode = scanner.nextLine();
//        System.out.print("Enter Phone Number : ");
//        String phoneNumber = scanner.nextLine();
//        System.out.print("Enter Email : ");
//        String email = scanner.nextLine();
//        arrayList.addPerson(new Contacts(firstName,lastName,address,cityName,stateName,zipCode,phoneNumber,email));
//    }
//non-static method for editing user data
//    void editUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter First Name : ");
//        String firstName = scanner.nextLine();
//        if (firstName.equals(contacts.getFirstName())) {
//            System.out.print("Enter First Name : ");
//            String fName = scanner.nextLine();
//            System.out.print("Enter Last Name : ");
//            String lastName = scanner.nextLine();
//            System.out.print("Enter Address : ");
//            String address = scanner.nextLine();
//            System.out.print("Enter City Name : ");
//            String cityName = scanner.nextLine();
//            System.out.print("Enter State Name : ");
//            String stateName = scanner.nextLine();
//            System.out.print("Enter Zip Code : ");
//            String zipCode = scanner.nextLine();
//            System.out.print("Enter Phone Number : ");
//            String phoneNumber = scanner.nextLine();
//            System.out.print("Enter Email : ");
//            String email = scanner.nextLine();
//            contacts.setFirstName(fName);
//            contacts.setLastName(lastName);
//            contacts.setAddress(address);
//            contacts.setCityName(cityName);
//            contacts.setStateName(stateName);
//            contacts.setZipCode(zipCode);
//            contacts.setPhoneNumber(phoneNumber);
//            contacts.setEmail(email);
//        } else {
//            System.out.println("Enter the correct details");
//        }
//    }
//
//    //non-static method for deleting user data
//    void deleteUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter First Name : ");
//        String firstName = scanner.nextLine();
//        if (firstName.equals(contacts.getFirstName())) {
//            contacts.setFirstName(null);
//            contacts.setLastName(null);
//            contacts.setAddress(null);
//            contacts.setCityName(null);
//            contacts.setStateName(null);
//            contacts.setZipCode(null);
//            contacts.setPhoneNumber(null);
//            contacts.setEmail(null);
//        } else {
//            System.out.println("Enter the correct details");
//        }
//    }

