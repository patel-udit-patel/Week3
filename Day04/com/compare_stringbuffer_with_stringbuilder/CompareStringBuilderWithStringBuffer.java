package Day04.com.compare_stringbuffer_with_stringbuilder;

public class CompareStringBuilderWithStringBuffer {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        //measuring StringBuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime / 1_000_000.0 + " ms");

        //Measuring StringBuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime / 1_000_000.0 + " ms");

        //Comparing results
        System.out.println("StringBuilder is " + (double) stringBufferTime / stringBuilderTime + " times faster than StringBuffer");
    }
}
