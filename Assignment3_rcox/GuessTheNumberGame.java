import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            playGame(scanner);
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
    }

    public static void playGame(Scanner scanner) {
        System.out.print("Enter the maximum number (N) for the secret number (1 to N): ");
        int maxNumber = scanner.nextInt();
        int secretNumber = generateSecretNumber(maxNumber);

        System.out.print("Enter the maximum number of guesses: ");
        int maxGuesses = scanner.nextInt();

        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        while (numberOfGuesses < maxGuesses) {
            System.out.print("Guess the secret number: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess == secretNumber) {
                System.out.println("Correct! You guessed the secret number in " + numberOfGuesses + " guesses.");
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("You've exceeded the maximum number of guesses. The secret number was " + secretNumber + ".");
        }
    }

    public static int generateSecretNumber(int maxNumber) {
        return (int) (Math.random() * maxNumber) + 1;
    }//end main
}//end class GuessTheNumberGame
