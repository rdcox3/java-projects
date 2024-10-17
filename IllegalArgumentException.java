public class IllegalArgumentException{
    public static void main(String[] args) {
        try {
            int number = -5; // Initializing a number (int) with an invalid value

            if (number < 0) {
                // Throwing an IllegalArgumentException if the number is negative
                throw new IllegalArgumentException("Number cannot be negative: " + number);
            }
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
            e.printStackTrace(); // Displaying stack trace for more information
        }
    }
}
