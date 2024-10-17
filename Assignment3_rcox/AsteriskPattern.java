package Asterisk;

import java.util.Scanner; //Using util scanner to parse text

//Pattern 1 Outer loop to iterate the pattern until the user input reached 
public class AsteriskPattern {
    public static void pattern1(int maxAsterisks) {
        for (int i = 1; i <= maxAsterisks; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//Pattern 2 - Inner loop to do same as outer loop in opposite order achieved by i--
    public static void pattern2(int maxAsterisks) {
        for (int i = maxAsterisks; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declare the object and initialize with
        // predefined standard input object

        System.out.print("Enter the maximum number of asterisks to display: ");
        int maxAsterisks = scanner.nextInt(); // defines int variable 
	//Uses nextInt() method to read integer value and initialize

        if (maxAsterisks <= 0) {
            System.out.println("Please enter a positive integer for the maximum number of asterisks.");
            return;
        }

        System.out.println("Choose an output pattern:");
        System.out.println("1. Pattern 1");
        System.out.println("2. Pattern 2");

        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt(); // defines int variable 
	//Uses nextInt() method to read integer value and initialize


        if (choice == 1) {
            pattern1(maxAsterisks);
        } else if (choice == 2) {
            pattern2(maxAsterisks);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }       
    }//end main
}//end class AsteriskPattern
