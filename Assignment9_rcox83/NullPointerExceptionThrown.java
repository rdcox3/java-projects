/*
Ron Cox
Java 605.201.83
Assignment 9

A NullPointerException is thrown when an application attempts to use null in a case where an object is required.
*/

public class NullPointerExceptionThrown {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length()); // This line will throw NullPointerException
    }
}//end class  NullPointerExceptionThrown
