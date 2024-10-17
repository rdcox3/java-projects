public class ClassCastExceptionCatch {
    public static void main(String[] args) {
        try {
            Object someObject = "Hello"; // Creating an Object and assigning a String to it

            // Attempting to cast the Object to an incompatible type (Integer in this case)
            Integer num = (Integer) someObject; // This will throw ClassCastException
        } catch (ClassCastException e) {
            // Handling the ClassCastException
            System.out.println("Error: ClassCastException caught. Reason - " + e.getMessage());
            System.out.println("Please ensure the object can be cast to the specified type.");
        }
    }
}
