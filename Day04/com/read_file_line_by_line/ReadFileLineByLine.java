package Day04.com.read_file_line_by_line;
import java.io.*;
public class ReadFileLineByLine {
    public static void main(String[] args) {
        //filePath containing path of file which user want to read
        String filePath = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day04/com/read_file_line_by_line/example.txt";

        //handling exception if file not found
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
