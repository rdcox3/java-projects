import java.util.Scanner;

/**
 * This program allows users to convert temperatures between Fahrenheit and Celsius.
 * It provides a menu-driven interface to choose between the conversion options.
 */
public class TemperatureConversion {
    /**
     * The main method of the TemperatureConversion program.
     * It displays a menu to the user and handles temperature conversions based on user input.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        final int CONVERT_TO_CELSIUS = 1;
        final int CONVERT_TO_FAHRENHEIT = 2;
        final int END_PROGRAM = 3;
        int userChoice = 0; // User selection: 1, 2, 3
        Scanner input = new Scanner(System.in); // Create a Scanner to obtain user input

        while (userChoice != END_PROGRAM) {
            System.out.print("Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: ");
            userChoice = input.nextInt(); // Read user input
            switch (userChoice) {
                case CONVERT_TO_CELSIUS:
                    convertFahrenheitToCelsius(input);
                    break;

                case CONVERT_TO_FAHRENHEIT:
                    convertCelsiusToFahrenheit(input);
                    break;

                case END_PROGRAM:
                    System.out.println("Bye Bye");
                    break;

                default: // Invalid Data Entered
                    System.out.println("Invalid Data: You must enter 1, 2, or 3");
            }
        }
        input.close();
    }

    /**
     * Converts a temperature in Fahrenheit to Celsius and prints the result.
     *
     * @param input Scanner object for user input.
     */
    private static void convertFahrenheitToCelsius(Scanner input) {
        System.out.print("Enter a Fahrenheit temperature: ");
        float tempF = input.nextFloat();
        float tempC = 5F / 9F * (tempF - 32F);
        System.out.println(tempF + " degrees Fahrenheit is " + tempC + " degrees Celsius");
    }

    /**
     * Converts a temperature in Celsius to Fahrenheit and prints the result.
     *
     * @param input Scanner object for user input.
     */
    private static void convertCelsiusToFahrenheit(Scanner input) {
        System.out.print("Enter a Celsius temperature: ");
        float tempC = input.nextFloat();
        float tempF = 9F / 5F * tempC + 32F;
        System.out.println(tempC + " degrees Celsius is " + tempF + " degrees Fahrenheit");
    }
}
