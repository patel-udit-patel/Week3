package org.example.search_a_target_in_a_large_dataset;

public class LinearSearch {
    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found target
            }
        }
        return -1; // Not found
    }
}
