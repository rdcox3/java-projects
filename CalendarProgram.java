import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a month (1-12)
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        // Prompt the user for a year
        System.out.print("Enter a year (e.g., 2012): ");
        int year = input.nextInt();

        // Create a calendar instance for the specified month and year
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        // Get the number of days in the specified month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the calendar header
        System.out.println("\nCalendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Set the calendar to the first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Determine the day of the week for the first day of the month
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print leading spaces for the first week
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day with leading zero if needed
            System.out.printf("%3d ", day);

            // Move to the next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            // Start a new line if it's a Sunday (end of the week)
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();
            }
        }

        // Close the scanner
        input.close();
    }
}
