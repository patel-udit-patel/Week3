package org.example.search_a_target_in_a_large_dataset;

public class BinarySearch {
    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                // Found target
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Not found
        return -1;
    }
}
