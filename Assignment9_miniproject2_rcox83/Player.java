/*
Ron Cox
Java 605.201.83
Assignment 9 Mini Project #2
*/

public class Player {
    private int balance;
    private Hand hand;

    public Player(int balance) {
        this.balance = balance;
        this.hand = new Hand();
    }

    public void bet(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Bet exceeds player's balance.");
        }
        // Just a placeholder to reserve the bet amount, actual deduction happens in loseMoney
    }

    public void winMoney(int amount) {
        balance += amount;
        System.out.println("You won $" + amount + ". Your new balance is $" + balance + ".");
    }

    public void loseMoney(int amount) {
        balance -= amount;
        System.out.println("You lost $" + amount + ". Your new balance is $" + balance + ".");
    }

    public int getBalance() {
        return balance;
    }

    public Hand getHand() {
        return hand;
    }
}//end class Player
