import java.io.*;

public class SummaryReport {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: SummaryReport C:\\Users\\rdcox\\Documents\\JAVA\\SmallAreaIncomePoverty\\SmallAreaIncomePovertyEstData.dat C:\\Users\\rdcox\\Documents\\JAVA\\SmallAreaIncomePoverty\\SummaryReport.csv 13487");
            return;
        }

               String inputFilePath = args[0];
        String outputFilePath = args[1];
        int numRecords = Integer.parseInt(args[2]); // Number of records from file

        System.out.println("Input File: " + inputFilePath);
        System.out.println("Output File: " + outputFilePath);
        System.out.println("Number of Records: " + numRecords);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int recordCount = 0;

            // Write CSV header to the output file
            writer.write("State, District ID, District Name, Population, Child Population, Child Poverty Population, Percentage of Children in Poverty\n");

            while ((line = reader.readLine()) != null && recordCount < numRecords) {
                String state = line.substring(0, 2).trim();
                String districtID = line.substring(3, 8).trim();
                String districtName = line.substring(9, 80).trim();

                // Extract string data for population, child population, and child poverty population
                String populationStr = line.substring(82, 90).trim();
                String childPopulationStr = line.substring(91, 99).trim();
                String childPovertyPopulationStr = line.substring(100, 108).trim();

                // Variables to store parsed integer values
                int population = 0;
                int childPopulation = 0;
                int childPovertyPopulation = 0;

                // Validate and convert to integers, or set default values if invalid
                if (!populationStr.isEmpty() && populationStr.matches("\\d+")) {
                    population = Integer.parseInt(populationStr);
                }

                if (!childPopulationStr.isEmpty() && childPopulationStr.matches("\\d+")) {
                    childPopulation = Integer.parseInt(childPopulationStr);
                }

                if (!childPovertyPopulationStr.isEmpty() && childPovertyPopulationStr.matches("\\d+")) {
                    childPovertyPopulation = Integer.parseInt(childPovertyPopulationStr);
                }

		float percentageChildrenInPoverty = (childPopulation > 0) ? ((float) childPovertyPopulation / childPopulation) * 100 : 0.0f;

		// Format the percentage to two decimal places as a String
		String formattedPercentage = String.format("%.2f", percentageChildrenInPoverty);

		// Process or output the extracted data (for demonstration)
		System.out.println("State: " + state);
		System.out.println("District ID: " + districtID);
		System.out.println("District Name: " + districtName);
		System.out.println("Population: " + population);
		System.out.println("Child Population: " + childPopulation);
		System.out.println("Child Poverty Population: " + childPovertyPopulation);
		System.out.println("Percentage of Children in Poverty: " + formattedPercentage + "%");

		// Write the extracted data to the output file
		String formattedData = String.format("%s, %s, %s, %d, %d, %d, %s%%\n", state, districtID, districtName, population, childPopulation, childPovertyPopulation, formattedPercentage);
		writer.write(formattedData);



                recordCount++;
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}