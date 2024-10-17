import java.io.*;

public class DataReformatter {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: DataReformatter <sourceFilePath> <destinationFilePath> <numRecords>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];
        int numRecords = Integer.parseInt(args[2]);

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            int recordCount = 0;
            while ((line = reader.readLine()) != null && recordCount < numRecords) {
                // Write the entire line to the reformatted file
                writer.write(line);
                writer.newLine();
                recordCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reformatted file written to: " + destinationFilePath);
    }
}
