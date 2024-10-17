/*
Ron Cox
Java 605.201.83
Assignment 5

*/

import java.util.Scanner;

public class MorseCodeTranslator {
    // Define a 2D array for Morse code translations
    // Each sub-array contains an English letter or number and its corresponding Morse code
    private static final String[][] morseCodeTranslations = {
        {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."}, {"F", "..-."},
        {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},
        {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."},
        {"S", "..."}, {"T", "-"}, {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
        {"Y", "-.--"}, {"Z", "--.."}, {"0", "-----"}, {"1", ".----"}, {"2", "..---"}, {"3", "...--"},
        {"4", "....-"}, {"5", "....."}, {"6", "-...."}, {"7", "--..."}, {"8", "---.."}, {"9", "----."}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose translation direction
        System.out.println("Choose translation:");
        System.out.println("1. Morse code to English");
        System.out.println("2. English to Morse code");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left after nextInt()

        // Perform the chosen translation
        if (choice == 1) {
            System.out.println("Enter Morse code separated by spaces and | for words:");
            String morseCode = scanner.nextLine();
            String englishTranslation = morseToEnglish(morseCode);
            System.out.println("English Translation: " + englishTranslation);
        } else if (choice == 2) {
            System.out.println("Enter English text separated by spaces:");
            String englishText = scanner.nextLine();
            String morseTranslation = englishToMorse(englishText);
            System.out.println("Morse Code Translation: " + morseTranslation);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Translate Morse code to English
    private static String morseToEnglish(String morseCodeStr) {
        StringBuilder englishTranslation = new StringBuilder();
        // Split the input into words based on the delimiter "|"
        String[] words = morseCodeStr.split(" \\| ");
        
        for (String word : words) {
            // Split each word into Morse code characters
            String[] morseChars = word.split(" ");
            for (String morseChar : morseChars) {
                // Search for the Morse code in the translation array and append the corresponding English letter
                for (String[] pair : morseCodeTranslations) {
                    if (pair[1].equals(morseChar)) {
                        englishTranslation.append(pair[0]);
                        break;
                    }
                }
            }
            // Add a space after each word
            englishTranslation.append(" ");
        }
        // Trim trailing spaces and return the translation
        return englishTranslation.toString().trim();
    }

    // Translate English to Morse code
    private static String englishToMorse(String englishText) {
        StringBuilder morseTranslation = new StringBuilder();
        // Split the input into words
        String[] words = englishText.split(" ");
        
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                // Search for the English letter in the translation array and append the corresponding Morse code
                for (String[] pair : morseCodeTranslations) {
                    if (pair[0].equalsIgnoreCase(String.valueOf(ch))) {
                        morseTranslation.append(pair[1]).append(" ");
                        break;
                    }
                }
            }
            // Add a delimiter "|" after each word
            morseTranslation.append("| ");
        }
        // Trim trailing spaces and return the translation
        return morseTranslation.toString().trim();
    }//end class MorseCodeTranslator
}//end main
