public class IllegalArgumentExceptionThrown {
    public static void validateAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(150); // Passing an invalid age
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
            e.printStackTrace(); // Displaying stack trace for more information
        }
    }
}





