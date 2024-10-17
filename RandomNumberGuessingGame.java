import java.util.Scanner;//imported the util.scanner class that we've been using to parse text

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerBound = 1; // set lower bound to 1
        int upperBound = 50; // set upper bound to 50
        int numberToGuess = generateRandomNumber(lowerBound, upperBound); //This function is used to initialize numberToGuess 
	//with a random number within the game's specified range.
        int numberOfTries = 0; //used to initialize a variable that counts 
	//the number of attempts made by the player in the game
        boolean hasGuessedCorrectly = false;//continues loop until guessed correct

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I am thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

	//iniatiate a while loop that continues until the boolean hasGuessedCorrectly is false
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess within the valid range.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations!! You guessed the number " + numberToGuess + " correctly in " + numberOfTries + " tries.");
            }
     }  
        scanner.close(); 
   }

    	//Function to generate a random number within a given range
	//Could have also imported java.util.Random at the top and used
    	public static int generateRandomNumber(int lowerBound, int upperBound) {
        return (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;

     }//end main
}//end class