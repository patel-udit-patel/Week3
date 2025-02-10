package org.example.string_concatenation_performance;

public class StringConcatenation {
    public static long stringConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";  // Creates a new object every iteration (O(N²) complexity)
        }
        return System.currentTimeMillis() - startTime;
    }
}
