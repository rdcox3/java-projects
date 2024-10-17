/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String employeeNumber, Name name, Address address, Date hireDate, double annualSalary) {
        super(employeeNumber, name, address, hireDate); // Call to the superclass (Employee) constructor
        this.annualSalary = annualSalary;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnnual Salary: " + annualSalary;
    }//end sub class SalariedEmployee
}
