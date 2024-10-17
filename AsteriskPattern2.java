package Asterisk;

import java.util.Scanner;

// Class outputs two different patterns of asterisks depending on user input of a positive integer. 

//Pattern 1 Outer loop to iterate the pattern until the user input reached. 
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
    //main argument body. Prints a request for user input
    public static void main(String[] args) {

 	// Declare the object and initialize with
        // predefined standard input object
        Scanner scanner = new Scanner(System.in);
            return;
        }

        System.out.println("Choose an output pattern:");
        System.out.println("1. Pattern 1");
        System.out.println("2. Pattern 2");
	//uses nextInt() method to read integer value
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

	//Gives user choice for which pattern to display
	//prints error if not 1 or 2
        if (choice == 1) {
            pattern1(maxAsterisks);
        } else if (choice == 2) {
            pattern2(maxAsterisks);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2."); 
        }

        scanner.close();
    } //end man()
} // end Class AsteriskPattern
