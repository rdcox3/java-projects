/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31 || year < 1900 || year > 2020) {
            throw new IllegalArgumentException("Invalid date.");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getters and Setters
    // Implement getters and setters here following the pattern from the Name class
    // Include validation similar to the constructor

    // toString method
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }//end class Date
}
