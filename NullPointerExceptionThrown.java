public class NullPointerExceptionThrown {
    public static void main(String[] args) {
        String str = null; // Initializing a String variable as null

        try {
            // Attempting to get the length of a null String
            int length = str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("NullPointerException occurred: " + e.getMessage());
            e.printStackTrace(); // Displaying stack trace for more information
        }
    }
}
