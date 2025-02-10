package org.example.comparing_data_structures_for_searching;

public class ArraySearch {
    //Method searches a target in a array
    public static long arraySearch(int[] array, int target) {
        long startTime = System.nanoTime();
        for (int num : array) {
            if (num == target) break;
        }
        return System.nanoTime() - startTime;
    }
}
