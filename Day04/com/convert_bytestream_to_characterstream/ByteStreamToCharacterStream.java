package Day04.com.convert_bytestream_to_characterstream;
import java.io.*;

public class ByteStreamToCharacterStream {
    public static void main(String[] args) {
        //filePath having path of file which is CharacterStream
        String filePath = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day04/com/convert_bytestream_to_characterstream/example.txt";

        //Handling Exception if file not found
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

