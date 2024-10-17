/*
Ron Cox
Java 605.201.83
Assignment 9

An IllegalArgumentException is thrown to indicate that a 
method has been passed an illegal or inappropriate argument.
*/

public class IllegalArgumentExceptionThrown {
    public static void main(String[] args) {
        setAge(-1); // This line will throw IllegalArgumentException
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}//end class IllegalArgumentExceptionThrown
