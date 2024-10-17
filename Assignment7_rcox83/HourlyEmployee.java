/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String employeeNumber, Name name, Address address, Date hireDate, double hourlyRate, double hoursWorked) {
        super(employeeNumber, name, address, hireDate); // Call to the superclass (Employee) constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate earnings
    public double calculateEarnings() {
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        } else {
            return (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
    }

    // Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked + "\nEarnings: " + calculateEarnings();
    }
}
