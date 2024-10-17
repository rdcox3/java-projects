/*
Ron Cox
Java 605.201.83
Assignment 9

An ArrayIndexOutOfBoundsException is thrown to indicate that an array has been accessed with an illegal index. 
The index is either negative or greater than or equal to the size of the array.
*/

public class ArrayIndexOutOfBoundsExceptionThrown {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // This line will throw ArrayIndexOutOfBoundsException
    }
}//end class ArrayIndexOutOfBoundsExceptionThrown
