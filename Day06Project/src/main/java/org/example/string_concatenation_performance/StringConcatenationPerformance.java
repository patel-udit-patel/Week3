package org.example.string_concatenation_performance;

public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int []sizes = new int[]{1000, 10000, 1000000};

        for (int size : sizes) {
            System.out.println("Concatenating " + size + " strings...");

            long timeString = StringConcatenation.stringConcatenation(size);
            long timeStringBuilder = StringBuilderConcatenation.stringBuilderConcatenation(size);
            long timeStringBuffer = StringBufferConcatenation.stringBufferConcatenation(size);

            System.out.println("Time taken using String: " + timeString + " ms");
            System.out.println("Time taken using StringBuilder: " + timeStringBuilder + " ms");
            System.out.println("Time taken using StringBuffer: " + timeStringBuffer + " ms");
            System.out.println();
        }

    }

}

