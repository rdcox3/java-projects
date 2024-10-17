/*
Ron Cox
Java 605.201.83
Assignment 4

*/

import java.util.Scanner;

public class Mod4CalendarProgram2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year.
        int year = getYearFromUser(input);

        // Loop through all months of the year and print the calendar for each.
        for (int month = 1; month <= 12; month++) {
            printMonthCalendar(month, year);
        }

        input.close();
    }

    private static int getYearFromUser(Scanner input) {
        System.out.print("Enter a year (e.g., 2020): ");
        while (!input.hasNextInt()) {
            System.out.println("That's not a number. Please enter a number.");
            input.next(); // Consume the invalid input.
        }
        return input.nextInt();
    }

    private static void printMonthCalendar(int month, int year) {
        printMonthHeader(month, year);
        printMonthBody(month, year);
    }

    private static void printMonthHeader(int month, int year) {
        System.out.println("\n\t" + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static void printMonthBody(int month, int year) {
        int startDay = getStartDay(month, 1, year);
        int numDaysInMonth = getNumDaysInMonth(month, year);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numDaysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0 || day == numDaysInMonth) {
                System.out.println();
            }
        }
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    public static int getStartDay(int month, int day, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        int dayOfWeek = (h + 6) % 7;

        return dayOfWeek;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

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
    }//end class Mod4CalendarProgram2
}//end main



