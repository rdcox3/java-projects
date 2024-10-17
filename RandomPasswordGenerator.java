import java.security.SecureRandom;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 12; // Password length is set to 12 characters
        String password = generateRandomPassword(passwordLength);
        System.out.println("Random Password: " + password);
    }

    public static String generateRandomPassword(int length) {
        if (length < 12) {
            throw new IllegalArgumentException("Password length must be at least 12 characters.");
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String specialCharacters = "!@#$%^&*()_-+=<>?";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Ensure at least one special character
        char randomSpecialChar = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password.append(randomSpecialChar);
        length--;

        // Generate the remaining characters
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            password.append(randomChar);
        }

        // Shuffle the characters in the password
        for (int i = password.length() - 1; i > 0; i--) {
            int swapIndex = random.nextInt(i + 1);
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(swapIndex));
            password.setCharAt(swapIndex, temp);
        }

        return password.toString();
    }
}
