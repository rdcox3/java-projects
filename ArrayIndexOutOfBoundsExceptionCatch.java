public class ArrayIndexOutOfBoundsExceptionCatch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
            // Accessing an index outside the array bounds
            int element = numbers[3]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Error: ArrayIndexOutOfBoundsException caught. Reason - " + e.getMessage());
            System.out.println("Please ensure the index is within the array bounds.");
        }
    }
}
