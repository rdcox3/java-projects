/*
Ron Cox
Java 605.201.83
Assignment 9

A NullPointerException is thrown when an application attempts to use null in a case where an object is required.
*/

public class NullPointerExceptionCatch {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: A null object was dereferenced.");
        }
    }
}//end class NullPointerExceptionCatch
