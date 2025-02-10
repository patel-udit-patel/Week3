package org.example.string_concatenation_performance;

public class StringBuilderConcatenation {
    public static long stringBuilderConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");  // Appends in-place (O(N) complexity)
        }
        return System.currentTimeMillis() - startTime;
    }

}
