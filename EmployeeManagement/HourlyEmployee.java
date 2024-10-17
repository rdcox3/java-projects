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
}