/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

import java.util.Scanner;

/**
 * This class represents the game logic for a Blackjack game.
 * It manages the game flow, user interactions, and the state of the game.
 */
public class BlackjackGame {
    private Deck deck; // Holds the deck of cards for the game
    private Hand dealerHand; // Holds the dealer's hand of cards
    private Hand playerHand; // Holds the player's hand of cards
    private Player player; // Represents the player, including their balance
    private int playerBet; // Stores the current bet amount by the player
    private Scanner scanner; // Scanner object for reading input from the console

    /**
     * Constructor for the BlackjackGame.
     * Initializes a new game with a given starting money for the player.
     * @param startingMoney the initial amount of money the player has.
     */
    public BlackjackGame(int startingMoney) {
        deck = new Deck();
        dealerHand = new Hand();
        playerHand = new Hand();
        player = new Player(startingMoney);
        scanner = new Scanner(System.in);
    }

    /**
     * The main method that controls the flow of the Blackjack game.
     * It handles the game rounds, user choices, and maintains the game loop.
     */
    public void play() {
        System.out.println("Welcome to Blackjack!");

        // Main game loop that continues until the player runs out of money
        while (player.getBalance() > 0) {
            deck.shuffle(); // Shuffle the deck at the start of each new round
            playerHand.clear(); // Clear the player's hand
            dealerHand.clear(); // Clear the dealer's hand

            int playerBet = takeBet(); // Prompt the player for their bet
            dealInitialCards(); // Deal initial two cards each to player and dealer

            // Check if anyone has a Blackjack at the start
            if (checkForBlackjack()) {
                continue; // Skip to the next round if there's a Blackjack
            }

            // Player's turn to draw cards
            boolean playerBusts = playerTurn();
            // Dealer's turn only occurs if the player hasn't busted
            if (!playerBusts) {
                dealerTurn();
            }

            // Determine and announce the winner of the round
            determineWinner(playerBet, playerBusts);
            // Ask if the player wants to play another round
            if (!playAnotherRound()) break;
        }

        // Game over message when the player runs out of money
        System.out.println("Game over. Your final balance is $" + player.getBalance() + ".");
        scanner.close(); // Close the scanner resource
    }

    /**
     * Prompts the player for their bet and ensures it is within their available balance.
     * @return the bet amount
     */
    private int takeBet() {
        int bet;
        do {
            System.out.println("You have $" + player.getBalance() + ". How much would you like to bet?");
            bet = scanner.nextInt();
            if (bet > player.getBalance()) {
                System.out.println("You cannot bet more than you have!");
            }
        } while (bet > player.getBalance());
        return bet;
    }

    /**
     * Deals the initial two cards to both the player and the dealer.
     */
    private void dealInitialCards() {
        playerHand.addCard(deck.draw());
        playerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());
        dealerHand.addCard(deck.draw());
        System.out.println("Dealer's hand: [hidden], " + dealerHand.getCard(1));
        System.out.println("Your hand: " + playerHand);
    }

    /**
     * Checks both the player's and dealer's hands for Blackjack at the start of the round.
     * @return true if there is a Blackjack, false otherwise
     */
    private boolean checkForBlackjack() {
        if (playerHand.isBlackjack()) {
            System.out.println("Blackjack! You win!");
            player.winMoney((int) (playerBet * 1.5)); // Player wins 1.5 times their bet
            return true;
        } else if (dealerHand.isBlackjack()) {
            System.out.println("Dealer has Blackjack! You lose!");
            player.loseMoney(playerBet); // Player loses their bet
            return true;
        }
        return false;
    }

    /**
     * Manages the player's turn where they can choose to hit or stand.
     * @return true if the player busts, false otherwise
     */
    private boolean playerTurn() {
        System.out.println("Your turn:");
        while (true) {
            System.out.println("Hit (1) or Stand (2)?");
            int choice = scanner.nextInt();
            if (choice == 1) {
                playerHand.addCard(deck.draw());
                System.out.println("You drew: " + playerHand.getLastCard());
                System.out.println("Your hand is now: " + playerHand);
                if (playerHand.busts()) {
                    System.out.println("Bust! You lose the round.");
                    return true;
                }
            } else {
                break;
            }
        }
        return false;
    }

    /**
     * Manages the dealer's turn where they must draw cards until reaching a hand value of at least 17.
     */
    private void dealerTurn() {
        System.out.println("Dealer's turn:");
        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.draw());
            System.out.println("Dealer draws: " + dealerHand.getLastCard());
        }
        System.out.println("Dealer's final hand: " + dealerHand);
    }

    /**
     * Determines the winner of the round based on the hands of the player and the dealer.
     * @param bet the amount of money the player bet
     * @param playerBusts whether the player has busted
     */
    private void determineWinner(int bet, boolean playerBusts) {
        if (playerBusts) {
            player.loseMoney(bet);
        } else {
            if (dealerHand.busts() || playerHand.getValue() > dealerHand.getValue()) {
                System.out.println("You win the round!");
                player.winMoney(bet);
            } else if (playerHand.getValue() < dealerHand.getValue()) {
                System.out.println("Dealer wins the round.");
                player.loseMoney(bet);
            } else {
                System.out.println("It's a tie!");
            }
        }
    }

    /**
     * Asks the player if they want to play another round.
     * @return true if the player wants to continue, false otherwise
     */
    private boolean playAnotherRound() {
        System.out.println("Do you want to play another round? (yes/no)");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes");
    }

    /**
     * Main method to start the game with a default starting balance.
     */
    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame(1000); // Start with $1000
        game.play();
    }
}//end class BlackjackGame
