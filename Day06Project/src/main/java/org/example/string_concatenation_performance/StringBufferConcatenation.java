package org.example.string_concatenation_performance;

public class StringBufferConcatenation {

    public static long stringBufferConcatenation(int n) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");  // Thread-safe but slightly slower than StringBuilder (O(N) complexity)
        }
        return System.currentTimeMillis() - startTime;
    }
}
