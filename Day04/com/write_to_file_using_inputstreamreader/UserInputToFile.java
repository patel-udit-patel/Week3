package Day04.com.write_to_file_using_inputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UserInputToFile {
    public static void main(String[] args) {
        //filePath having path of file where user want to write
        String filePath = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day04/com/write_to_file_using_inputstreamreader/example.txt";

        //Handling Exception if file not found
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("User input has been saved to " + filePath);

        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}
