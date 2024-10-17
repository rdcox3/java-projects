/*
Ron Cox
Java 605.201.83
Assignment 9

A ClassCastException is thrown to indicate that the code has attempted to 
cast an object to a subclass of which it is not an instance.
*/

public class ClassCastExceptionThrown {
    public static void main(String[] args) {
        Object i = Integer.valueOf(42);
        String s = (String) i; // This line will throw ClassCastException
    }
}//end ClassCastExceptionThrown
