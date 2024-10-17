public class ClassCastExceptionThrown {
    public static void main(String[] args) {
        try {
            Object someObject = "Hello"; // Creating an Object and assigning a String to it

            // Attempting to cast the Object to an incompatible type (Integer in this case)
            Integer num = (Integer) someObject; // This will throw ClassCastException
        } catch (ClassCastException e) {
            // Handling the ClassCastException
            System.out.println("ClassCastException occurred: " + e.getMessage());
            e.printStackTrace(); // Displaying stack trace for more information
        }
    }
}
