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