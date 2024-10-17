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
