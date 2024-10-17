/*
Ron Cox
Java 605.201.83
Assignment 9
*/

public class IllegalArgumentExceptionCatch {
    public static void main(String[] args) {
        try {
            setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}//end class IllegalArgumentExceptionCatch
