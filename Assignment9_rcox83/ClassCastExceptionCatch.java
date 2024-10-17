/*
Ron Cox
Java 605.201.83
Assignment 9
*/

public class ClassCastExceptionCatch {
    public static void main(String[] args) {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: An object was cast to a type it's not an instance of.");
        }
    }
}//end class ClassCastExceptionCatch
