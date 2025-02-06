package Day04.com.compare_filereader_and_inpustearmreader;

import java.io.*;

public class CompareFileReaderAndInputStreamReader {
    public static void main(String[] args) {

        //filePath having path of file
        String filePath = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week3/Day04/com/convert_bytestream_to_characterstream/example.txt";
        //storing start time of reading file by Input
        long timeForInputStreamStart=System.nanoTime();
        try (

                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (
                IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        //storing time when reading ends
        long timeForInputStreamEnd=System.nanoTime();

        //storing time when reading starts by fileReader
        long timeForFileReaderStart=System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        //storing time when reading ends
        long timeForFileReaderEnd=System.nanoTime();

        //Calculating number of milliseconds
        long inputStreamReaderTime = timeForInputStreamEnd - timeForInputStreamStart;
        long fileReaderTime=timeForFileReaderEnd-timeForFileReaderStart;
        System.out.println("Time taken by InputStreamReader: " + inputStreamReaderTime / 1_000_000.0 + " ms");
        System.out.println("Time taken by FileReader: "+fileReaderTime/1_000_000.0+ " ms");
        // Comparing results
        System.out.println("FileReader is " + (double) inputStreamReaderTime /fileReaderTime + " times faster than InputStreamReader");

    }
}
