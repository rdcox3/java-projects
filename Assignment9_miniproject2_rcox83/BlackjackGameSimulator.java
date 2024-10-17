/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

/*
 * This class serves as the entry point to the Blackjack game simulator. It initializes the game with a default
 * amount of money for the player and starts the game. The game continues until the player decides to quit or
 * runs out of money. This version of Blackjack runs in the console, providing
 * a basic text-based interface for the player to interact with the game.
 */

public class BlackjackGameSimulator {

    /*
     * The main method that starts the Blackjack game. It creates an instance of the BlackjackGame class,
     * initializes it with a starting balance for the player, and then starts the game.
     * 
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        BlackjackGame game = new BlackjackGame(1000); // Initializes the game with $1000 for the player
        game.play(); // Starts the game
    }
}//end class BlackjackGameSimulator
