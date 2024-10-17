/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

import java.util.ArrayList;

/*
 * Represents a hand of playing cards, such as a player might hold. Can calculate the score of the hand in the context of Blackjack.
 */
public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void clear() {
        cards.clear();
    }

    public int getScore() {
        int score = 0;
        int aceCount = 0;
        for (Card card : cards) {
            int value = card.getValue();
            score += value;
            if (card.getFace().equals("A")) {
                aceCount++;
            }
        }
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }
        return score;
    }

    public Card getLastCard() {
        if (!cards.isEmpty()) {
            return cards.get(cards.size() - 1);
        }
        return null; // Return null or consider throwing an exception
    }

    public Card getCard(int index) {
    	if (index >= 0 && index < cards.size()) {
        return cards.get(index);
    }

    return null;  // Or throw an exception based on your error handling policy
}


    public int getValue() {
        return getScore(); // Optional method if needed for consistency
    }

    public boolean isBlackjack() {
        return cards.size() == 2 && getScore() == 21;
    }

    public boolean busts() {
        return getScore() > 21;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append(" ");
        }
        return sb.toString().trim();
    }
}//end class Hand
