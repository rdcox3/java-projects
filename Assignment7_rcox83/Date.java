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
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Setters 
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }//end class Date
}
