/*
Ron Cox
Java 605.201.83
Assignment 10
*/

import java.io.*;
import java.text.DecimalFormat;

public class DataReporter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java DataReporter <inputFilePath>");
            System.exit(1);
        }

        String inputFilePath = args[0];
        DecimalFormat df = new DecimalFormat("0.00"); // For formatting the percentage

        System.out.printf("%-5s %-12s %-17s %-22s %-15s%n", "State", "Population", "Child Population", "Child Poverty Population", "% Child Poverty");
        System.out.printf("%-5s %-12s %-17s %-22s %-15s%n", "-----", "------------", "-----------------", "----------------------", "---------------");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Extract the numerical data which are always located before "USSD13.txt"
                String[] parts = line.split("USSD13.txt")[0].trim().split("\\s+");
                int length = parts.length;

                // Get population, child population, and child poverty population
                int population = Integer.parseInt(parts[length - 3]);
                int childPopulation = Integer.parseInt(parts[length - 2]);
                int childPovertyPopulation = Integer.parseInt(parts[length - 1]);

                // Calculate % child poverty
                double childPovertyPercentage = (double) childPovertyPopulation / childPopulation * 100;

                // Extract state code (first part of the line)
                String state = line.substring(0, 2);

                // Print out the formatted data
                System.out.printf("%-5s %-12d %-17d %-22d %-15s%n",
                        state, population, childPopulation, childPovertyPopulation, df.format(childPovertyPercentage));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + inputFilePath);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
        } catch (NumberFormatException e) {
            System.err.println("Error parsing numeric data from the file.");
        }
    }
}//end class DataReporter

