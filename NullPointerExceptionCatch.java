public class NullPointerExceptionCatch {
    public static void main(String[] args) {
        String str = null; // Initializing a String variable as null

        try {
            // Attempting to get the length of a null String
            int length = str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Error: NullPointerException caught. Reason - " + e.getMessage());
            System.out.println("Please ensure the object is not null before using its methods.");
        }
    }
}
