/*
Ron Cox
Java 605.201.83
Assignment 11
*/

import java.util.*;
import java.io.*;

public class ContactList {
    private TreeMap<String, Contact> contacts = new TreeMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.lastName, contact);
    }

    public void deleteContact(String lastName) {
        if (contacts.containsKey(lastName)) {
            contacts.remove(lastName);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts() {
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }

    public void saveContactsToFile(String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(contacts);
        }
    }

@SuppressWarnings("unchecked")//kept getting Xlint warnings
public void loadContactsFromFile(String filename) throws IOException {
    File file = new File(filename);
    if (file.exists()) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (TreeMap<String, Contact>) in.readObject();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found during deserialization: " + e.getMessage());
            throw new IOException("Failed to deserialize the contacts file", e);
        }
    } else {
        System.out.println("File does not exist. Starting a new contact list.");
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();

        System.out.print("Enter the filename to load/save contacts: ");
        String filename = scanner.nextLine();

        try {
            contactList.loadContactsFromFile(filename);
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        while (true) {
            System.out.println("Choose an action: (1) Add Contact (2) Delete Contact (3) Display Contacts (4) Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, phoneNumber, emailAddress);
                    contactList.addContact(newContact);
                    try {
                        contactList.saveContactsToFile(filename);
                    } catch (IOException e) {
                        System.out.println("Error saving contacts: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the last name of the contact to delete: ");
                    lastName = scanner.nextLine();
                    contactList.deleteContact(lastName);
                    try {
                        contactList.saveContactsToFile(filename);
                    } catch (IOException e) {
                        System.out.println("Error saving contacts: " + e.getMessage());
                    }
                    break;
                case 3:
                    contactList.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
            }
        }
    }
}//end class ContactList
