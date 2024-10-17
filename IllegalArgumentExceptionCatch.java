public class IllegalArgumentExceptionCatch {
    public static void main(String[] args) {
        try {
            int number = -5; // Initializing a number (int) with an invalid value

            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative: " + number);
            }
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("Error: IllegalArgumentException caught. Reason - " + e.getMessage());
            System.out.println("Please ensure the argument meets the required conditions.");
        }
    }
}
