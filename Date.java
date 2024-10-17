import java.util.Scanner;

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

class Employee {
    private int employeeNumber;
    private Name name;
    private Address address;
    private Date hireDate;

    public Employee(int employeeNumber, Name name, Address address, Date hireDate) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee Number: " + employeeNumber + "\nName: " + name + "\nAddress: " + address + "\nHire Date: " + hireDate + "\n";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        Employee[] employees = new Employee[numEmployees];
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter Employee #" + (i + 1) + " details:");
            
            System.out.print("Employee Number: ");
            int empNumber = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Street: ");
            String street = scanner.nextLine();
            
            System.out.print("City: ");
            String city = scanner.nextLine();
            
            System.out.print("State (2 characters): ");
            String state = scanner.nextLine();
            
            System.out.print("Zip Code (5 digits): ");
            String zipCode = scanner.nextLine();
            
            System.out.print("Hire Date (MM DD YYYY): ");
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();
            
            scanner.nextLine(); // Consume the newline
            
            // Create Name, Address, and Date objects
            Name name = new Name(firstName, lastName);
            Address address = new Address(street, city, state, zipCode);
            Date hireDate = new Date(month, day, year);
            
            // Create an Employee object and store it in the array
            employees[i] = new Employee(empNumber, name, address, hireDate);
        }
        
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        scanner.close();
    }
}
