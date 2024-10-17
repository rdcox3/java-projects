/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

import java.util.ArrayList;
import java.util.Collections;

/*
 * Represents a deck of playing cards. It can be shuffled and cards can be dealt from it.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String suit : suits) {
            for (String face : faces) {
                cards.add(new Card(face, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        } else {
            throw new IllegalStateException("No more cards in the deck to deal.");
        }
    }

    public int remainingCards() {
        return cards.size();
    }
}//end class Deck
