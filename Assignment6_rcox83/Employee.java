/*
Ron Cox
Java 605.201.83
Assignment 6

*/
public class Employee {
    private String employeeNumber;
    private Name name;
    private Address address;
    private Date hireDate;

    // Constructor
    public Employee(String employeeNumber, Name name, Address address, Date hireDate) {
        if (employeeNumber.isBlank()) {
            throw new IllegalArgumentException("Employee number must not be blank.");
        }
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    // Getters and Setters
    // Implement getters and setters here following the pattern from the Name class

    // toString method
    @Override
    public String toString() {
        return "Employee Number: " + employeeNumber + "\nName: " + name + "\nAddress: " + address + "\nHire Date: " + hireDate;
    }//end class Employee
}
