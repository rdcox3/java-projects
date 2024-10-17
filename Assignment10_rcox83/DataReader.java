/*
Ron Cox
Java 605.201.83
Assignment 10
*/

import java.io.*;

public class DataReader {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java DataReader <sourceFilePath> <destinationFilePath> <numberOfRecords>");
            System.exit(1);
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];
        int numberOfRecords = Integer.parseInt(args[2]);

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath))) {

            for (int i = 0; i < numberOfRecords; i++) {
                String line = br.readLine();
                if (line == null) break;

                String reformattedLine = reformatLine(line);
                bw.write(reformattedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String reformatLine(String line) {
        // Extract the required fields from the line. Assume fixed width for now.
        String state = line.substring(0, 2).trim();
        String population = line.substring(2, 12).trim();
        String childPopulation = line.substring(12, 22).trim();
        String childPovertyPopulation = line.substring(22, 32).trim();
        String childPovertyPercentage = line.substring(32).trim();

        // Reformat into a CSV format.
        return String.join(",", state, population, childPopulation, childPovertyPopulation, childPovertyPercentage);
    }
}//end class DataReader
