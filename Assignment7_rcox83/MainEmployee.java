/*
Ron Cox
Java 605.201.83
Assignment 6

*/

import java.util.Scanner;

public class MainEmployee{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Existing code to collect common information (Name, Address, Date)

        // Get Employee Number
        System.out.print("Enter employee number: ");
        String employeeNumber = scanner.nextLine();

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

        // This is necessary to consume the newline left-over
        scanner.nextLine();

	//Initialize defined classes
        Name name = new Name(firstName, lastName);
        Address address = new Address(street, city, state, zipCode);
        Date hireDate = new Date(month, day, year);

        // Ask the user to choose the type of employee to create
        System.out.println("Enter type of employee (1 for Salaried, 2 for Hourly): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine(); // Fixed to properly clear the scanner buffer

        Employee employee = null;

        if (employeeType == 1) {
            System.out.print("Enter annual salary: ");
            double annualSalary = scanner.nextDouble();
            employee = new SalariedEmployee(employeeNumber, name, address, hireDate, annualSalary);
        } else if (employeeType == 2) {
            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            employee = new HourlyEmployee(employeeNumber, name, address, hireDate, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid employee type selected.");
        }

        // Display employee information
        if (employee != null) {
            System.out.println("\nEmployee Information:");
            System.out.println(employee);
        }

        scanner.close();
    }//end class MainEmployee
}//end main
