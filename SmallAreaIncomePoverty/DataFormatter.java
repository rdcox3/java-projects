import java.io.*;

public class DataFormatter {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: DataFormatter C:\\Users\\rdcox\\Documents\\JAVA\\SmallAreaIncomePoverty\\SmallAreaIncomePovertyEstData.dat 13487");
            return;
        }

         String inputFilePath = args[0];
        int numRecords = Integer.parseInt(args[1]); // Number of records

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            int recordCount = 0;
            while (recordCount < numRecords && reader.ready()) {
                String line = reader.readLine();

                // Check the length of the line before extracting substrings
                if (line.length() >= 108) { // Ensure the line is long enough for the expected substring extraction
                    String state = line.substring(0, 2).trim();
                    String districtID = line.substring(3, 8).trim();
                    String districtName = line.substring(9, 80).trim();
                    String population = line.substring(82, 90).trim();
                    String childPopulation = line.substring(91, 99).trim();
                    String childPovertyPopulation = line.substring(100, 108).trim();

                    // Format data into CSV-like columns and output to the console
                    String formattedData = String.format("%s, %s, %s, %s, %s, %s\n", state, districtID, districtName, population, childPopulation, childPovertyPopulation);
                    System.out.print(formattedData);
                }

                recordCount++;
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}