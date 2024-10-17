/*
Ron Cox
Java 605.201.83
Assignment 9
*/

public class ArrayIndexOutOfBoundsExceptionCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index is out of range.");
        }
    }
}//end class ArrayIndexOutOfBoundsExceptionCatch
