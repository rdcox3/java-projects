import java.io.*;
import java.util.*;

public class ContactListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file to store the contact list: ");
        String fileName = scanner.nextLine();

        TreeMap<String, Contact> contactList = readContactListFromFile(fileName);

        while (true) {
            System.out.println("\nContact List Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Delete a contact");
            System.out.println("3. Display the contact list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addContact(scanner, contactList);
                    break;
                case 2:
                    deleteContact(scanner, contactList);
                    break;
                case 3:
                    displayContactList(contactList);
                    break;
                case 4:
                    writeContactListToFile(fileName, contactList);
                    System.out.println("Exiting the program. Contact list saved to " + fileName);
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static TreeMap<String, Contact> readContactListFromFile(String fileName) {
        TreeMap<String, Contact> contactList = new TreeMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            contactList = (TreeMap<String, Contact>) ois.readObject();
            System.out.println("Contact list loaded from " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("No existing contact list found. Creating a new one.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return contactList;
    }

    private static void writeContactListToFile(String fileName, TreeMap<String, Contact> contactList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(contactList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addContact(Scanner scanner, TreeMap<String, Contact> contactList) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, emailAddress);
        contactList.put(lastName, newContact);

        System.out.println("Contact added: " + newContact);
    }

    private static void deleteContact(Scanner scanner, TreeMap<String, Contact> contactList) {
        System.out.print("Enter the last name of the contact to delete: ");
        String lastNameToDelete = scanner.nextLine();

        Contact removedContact = contactList.remove(lastNameToDelete);

        if (removedContact != null) {
            System.out.println("Contact deleted: " + removedContact);
        } else {
            System.out.println("Contact not found with last name: " + lastNameToDelete);
        }
    }

    private static void displayContactList(TreeMap<String, Contact> contactList) {
        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contactList.values()) {
                System.out.println(contact);
            }
        }
    }

    // Contact class representing a person's contact information
    private static class Contact implements Serializable {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String emailAddress;

        public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", emailAddress='" + emailAddress + '\'' +
                    '}';
        }
    }
}
