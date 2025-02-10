package org.example.large_file_reading_efficiency;

import java.io.*;

public class LargeFileReadingEfficiency {
    //
    private static final String FILE_PATH_ONE = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day06Project/src/main/java/org/example/large_file_reading_efficiency/largefile1mb.txt";
    private static final String FILE_PATH_TWO="C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day06Project/src/main/java/org/example/large_file_reading_efficiency/largefile100mb.txt";
    private static final String FILE_PATH_THREE= "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day06Project/src/main/java/org/example/large_file_reading_efficiency/largefile500mb.txt";

    public static void main(String[] args) throws IOException {
        String[] filePaths = new String[]{FILE_PATH_ONE,FILE_PATH_TWO,FILE_PATH_THREE};

        for (String filePath : filePaths) {
            System.out.println("Reading a large file using different methods...");

            long timeFileReader = FileReaderReading.fileReader(filePath);
            long timeInputStreamReader = InputStearmReaderReading.inputStreamReader(filePath);

            System.out.println("Time taken using FileReader: " + timeFileReader + " ms");
            System.out.println("Time taken using InputStreamReader: " + timeInputStreamReader + " ms");
        }
    }
}

