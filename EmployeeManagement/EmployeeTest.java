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