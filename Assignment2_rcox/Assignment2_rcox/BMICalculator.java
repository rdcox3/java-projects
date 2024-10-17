package test;

import java.util.Scanner;

// Class which calculates BMI based on user inputs

public class BMICalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // Convert height from inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

         // Determine BMI category
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            bmiCategory = "Normal";
        } else if (bmi >= 25.00 && bmi <= 29.99) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        // Display the result in a tabular format
        System.out.println("BMI Calculator Results");
        System.out.println("-----------------------");
        System.out.printf("| Weight    | %.2f pounds  |\n", weightInPounds);
        System.out.printf("| Height    | %.2f inches  |\n", heightInInches);
        System.out.printf("| BMI       | %.2f         |\n", bmi);
        System.out.println("-----------------------");
        System.out.printf("| BMI Category | %s  |\n", bmiCategory);
        System.out.println("-----------------------");

    } // end main()
} //  end class Original



