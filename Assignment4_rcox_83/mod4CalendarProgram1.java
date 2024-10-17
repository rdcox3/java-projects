/*
Ron Cox
Java 605.201.83
Assignment 4

*/

import java.util.Scanner;

// This class displays a calendar for a specified month and year.
public class Mod4CalendarProgram1 {
    // Main method to run the program.
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Get the month and year from the user.
        int month = getMonthFromUser(input);
        int year = getYearFromUser(input);

        // Print the calendar for the specified month and year.
        printMonthCalendar(month, year);

        // Close the scanner.
        input.close();
    }

    // Prompts the user to enter a month and validates the input.
    private static int getMonthFromUser(Scanner input) {
        int month;
        do {
            System.out.print("Enter a month (1-12): ");
            while (!input.hasNextInt()) { // Check if the input is not an integer.
                System.out.println("That's not a number. Please enter a number.");
                input.next(); // Consume the invalid input.
            }
            month = input.nextInt(); // Read the month input.
            if (month < 1 || month > 12) { // Validate the month range.
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
            }
        } while (month < 1 || month > 12); // Repeat until a valid month is entered.
        return month;
    }

    // Prompts the user to enter a year and validates the input.
    private static int getYearFromUser(Scanner input) {
        System.out.print("Enter a year (e.g., 2012): ");
        while (!input.hasNextInt()) { // Check if the input is not an integer.
            System.out.println("That's not a number. Please enter a number.");
            input.next(); // Consume the invalid input.
        }
        return input.nextInt(); // Read the year input.
    }

    // Prints the calendar for the given month and year.
    private static void printMonthCalendar(int month, int year) {
        printMonthHeader(month, year); // Print the month header.
        printMonthBody(month, year); // Print the month body.
    }

    // Prints the header of the calendar, including the month name and year.
    private static void printMonthHeader(int month, int year) {
        System.out.println("\n\t" + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // Prints the body of the calendar, including all days of the month.
    private static void printMonthBody(int month, int year) {
        int startDay = getStartDay(month, 1, year); // Get the start day of the month.
        int numDaysInMonth = getNumDaysInMonth(month, year); // Get the number of days in the month.

        // Print spaces before the first day of the month.
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print each day of the month.
        for (int day = 1; day <= numDaysInMonth; day++) {
            System.out.printf("%4d", day);
            // Start a new line after the last day of the week or the last day of the month.
            if ((day + startDay) % 7 == 0 || day == numDaysInMonth) {
                System.out.println();
            }
        }
    }

    // Returns the name of the month for the given month number.
    private static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Calculates the start day of the month/year using Zeller's Algorithm.
    public static int getStartDay(int month, int day, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        int dayOfWeek = (h + 6) % 7; // Adjusted Zeller's to ensure correct start day for month

        return dayOfWeek;
    }

    // Determines if the specified year is a leap year.
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Returns the number of days in the specified month and year.
    private static int getNumDaysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }//end class Mod4CalendarProgram1
}//end main

