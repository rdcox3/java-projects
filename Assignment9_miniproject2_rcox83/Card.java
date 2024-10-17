/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

import java.util.Set;  // At the top of your Card.java

/*
 * Represents a playing card with a face (e.g., Ace, King, Queen, Jack, numbers) and a suit (e.g., Spades, Hearts, Diamonds, Clubs).
 */

public class Card {
    private String face;
    private String suit;
    private static final Set<String> validFaces = Set.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");

    public Card(String face, String suit) {
        if (!validFaces.contains(face)) {
            throw new IllegalArgumentException("Invalid card face: " + face);
        }
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public int getValue() {
        return switch (face) {
            case "A" -> 11;
            case "K", "Q", "J" -> 10;
            default -> Integer.parseInt(face);
        };
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}//end classs Card
