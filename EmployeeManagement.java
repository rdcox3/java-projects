package EmployeeManagement;
import java.util.Scanner;

class Date {
    private int month;
    private int day;
    private int year;

    /**
     * Constructs a Date object with the specified month, day, and year.
     *
     * @param month The month (1-12).
     * @param day   The day (1-31).
     * @param year  The year (greater than 1900 and less than 2020).
     */
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

    /**
     * Constructs a Name object with the specified first name and last name.
     *
     * @param firstName The first name.
     * @param lastName  The last name.
     */
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

    /**
     * Constructs an Address object with the specified street, city, state, and zip code.
     *
     * @param street  The street address.
     * @param city    The city.
     * @param state   The state (2 characters).
     * @param zipCode The zip code (5 digits).
     */
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

    /**
     * Constructs an Employee object with the specified employee number, name, address, and hire date.
     *
     * @param employeeNumber The employee number.
     * @param name           The name (a Name object).
     * @param address        The address (an Address object).
     * @param hireDate       The hire date (a Date object).
     */
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

public class Employee {
    private int employeeNumber;
    private Name name;
    private Address address;
    private Date hireDate;

    public Employee(int employeeNumber, String firstName, String lastName,
                    String street, String city, String state, String zipCode,
                    int month, int day, int year) {
        this.employeeNumber = employeeNumber;
        this.name = new Name(firstName, lastName);
        this.address = new Address(street, city, state, zipCode);
        this.hireDate = new Date(month, day, year);
    }

    // Getters and setters for employee attributes
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setName(String firstName, String lastName) {
        name.setFirstName(firstName);
        name.setLastName(lastName);
    }

    public void setAddress(String street, String city, String state, String zipCode) {
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zipCode);
    }

    public void setHireDate(int month, int day, int year) {
        hireDate.setMonth(month);
        hireDate.setDay(day);
        hireDate.setYear(year);
    }

    @Override
    public String toString() {
        return "Employee Number: " + employeeNumber + "\n" +
               "Name: " + name.toString() + "\n" +
               "Address: " + address.toString() + "\n" +
               "Hire Date: " + hireDate.toString();
    }
}

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(int employeeNumber, String firstName, String lastName,
                           String street, String city, String state, String zipCode,
                           int month, int day, int year, double annualSalary) {
        super(employeeNumber, firstName, lastName, street, city, state, zipCode, month, day, year);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Annual Salary: $" + annualSalary;
    }
}

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;
    private int hoursWorked;

    public HourlyEmployee(int employeeNumber, String firstName, String lastName,
                          String street, String city, String state, String zipCode,
                          int month, int day, int year, double hourlyPayRate, int hoursWorked) {
        super(employeeNumber, firstName, lastName, street, city, state, zipCode, month, day, year);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateEarnings() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            return regularPay + overtimePay;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Hourly Pay Rate: $" + hourlyPayRate + "\n" +
               "Hours Worked: " + hoursWorked + "\n" +
               "Earnings: $" + calculateEarnings();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(1, "John", "Doe", "123 Main St",
                "Cityville", "CA", "12345", 1, 15, 2020, 60000.0);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(2, "Alice", "Smith", "456 Elm St",
                "Townsville", "NY", "54321", 4, 5, 2019, 15.0, 35);

        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(3, "Bob", "Johnson", "789 Oak St",
                "Villagetown", "TX", "67890", 8, 10, 2022, 12.0, 50);

        System.out.println("Salaried Employee Information:");
        System.out.println(salariedEmployee.toString());

        System.out.println("\nHourly Employee 1 Information:");
        System.out.println(hourlyEmployee1.toString());

        System.out.println("\nHourly Employee 2 Information:");
        System.out.println(hourlyEmployee2.toString());
    }
}
        scanner.close();
    }//end class
}//end main
