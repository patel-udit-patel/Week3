package org.example.large_file_reading_efficiency;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderReading {
    public static long fileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileReader reader = new FileReader(filePath)) {
            while (reader.read() != -1) {
                // Reading character by character
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()+"File not found");
        }
        return System.currentTimeMillis() - startTime;
    }
}
