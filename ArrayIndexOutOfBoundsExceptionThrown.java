public class ArrayIndexOutOfBoundsExceptionThrown {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Initializing an array

        try {
            // Accessing an index outside the array bounds
            int element = arr[3]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            e.printStackTrace(); // Displaying stack trace for more information
        }
    }
}
