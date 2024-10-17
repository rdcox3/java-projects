/*
Ron Cox
Java 605.201.83
Assignment 6

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Name information
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Get Address information
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state (2 characters): ");
        String state = scanner.nextLine();
        System.out.print("Enter zip code (5 digits): ");
        String zipCode = scanner.nextLine();

        // Get Hire Date information
        System.out.print("Enter hire year (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Enter hire month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter hire day (DD): ");
        int day = scanner.nextInt();
        
        // Skipping line after reading int to clear the buffer
        scanner.nextLine();

        // Get Employee Number
        System.out.print("Enter employee number: ");
        String employeeNumber = scanner.nextLine();

        // Create instances based on user input
        Name name = new Name(firstName, lastName);
        Address address = new Address(street, city, state, zipCode);
        Date hireDate = new Date(month, day, year);
        Employee employee = new Employee(employeeNumber, name, address, hireDate);

        // Display the employee information
        System.out.println("\nEmployee Information:");
        System.out.println(employee);

        scanner.close();
    }//end class Main
}//end Main
