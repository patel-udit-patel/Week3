package org.example.large_file_reading_efficiency;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStearmReaderReading {
    public static long inputStreamReader(String filePath)  {
        long startTime = System.currentTimeMillis();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
            while (reader.read() != -1) {
                // Reading bytes and converting to characters
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()+"File not found ");
        }
        return System.currentTimeMillis() - startTime;
    }
}
