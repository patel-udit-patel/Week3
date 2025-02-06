package Day04.com.count_occurrence_of_a_word_in_file;

import java.io.*;
import java.util.Scanner;

public class WordCountInFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //filePath have path of the file user want to check for word occurrence
        String filePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week3\\Day04\\com\\count_occurrence_of_a_word_in_file\\example.txt";

        //Taking word from user which has to be check
        System.out.println("Enter the word to count ");
        String targetWord = input.nextLine();
        int wordCount = 0;

        //Handling exception if file not found
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" "); // Split by whitespace
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}