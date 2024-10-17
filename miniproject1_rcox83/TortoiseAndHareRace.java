/*
Ron Cox
Java 605.201.83
Mini Project 1

*/

public class TortoiseAndHareRace {
    private static final int RACE_END = 50;
    private static int tortoisePosition = 1;
    private static int harePosition = 1;

    public static void main(String[] args) {
        System.out.println("AND THEY'RE OFF!!");
        while (tortoisePosition < RACE_END && harePosition < RACE_END) {
            tortoisePosition = moveTortoise(tortoisePosition);
            harePosition = moveHare(harePosition);
            printPositions();
        }
        
        // Determine the winner
        if (tortoisePosition >= RACE_END && harePosition >= RACE_END) {
            System.out.println("IT'S A TIE!!");
        } else if (tortoisePosition >= RACE_END) {
            System.out.println("TORTOISE WINS!!");
        } else if (harePosition >= RACE_END) {
            System.out.println("HARE WINS!!");
        }
    }

    private static int moveTortoise(int position) {
        int move = (int) (Math.random() * 10) + 1;
        if (move <= 5) { // Fast plod
            position += 3;
        } else if (move <= 8) { // Slow plod
            position += 1;
        } else { // Slip
            position -= 6;
            if (position < 1) position = 1;
        }
        return position;
    }

    private static int moveHare(int position) {
        int move = (int) (Math.random() * 10) + 1;
        if (move <= 2) { // Big hop
            position += 9;
        } else if (move <= 5) { // Small hop
            position += 1;
        } else if (move == 6) { // Big slip
            position -= 12;
            if (position < 1) position = 1;
        } else if (move <= 8) { // Small slip
            position -= 2;
            if (position < 1) position = 1;
        } // else fall asleep, no change in position
        return position;
    }

    private static void printPositions() {
        for (int i = 1; i <= RACE_END; i++) {
            if (i == tortoisePosition && i == harePosition) {
                System.out.print("OUCH!!");
                i += "OUCH!!".length() - 1; // Adjust for the length of "OUCH!!"
            } else if (i == tortoisePosition) {
                System.out.print("T");
            } else if (i == harePosition) {
                System.out.print("H");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }//end class TortoiseAndHareRace
}//end main
