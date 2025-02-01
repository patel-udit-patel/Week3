package com.sort_exam_scores;

public class SelectionSort {
    public void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds the minimum element
            int minIdx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {

                    // Update min_idx if a smaller element is found
                    minIdx = j;
                }
            }

            // Move minimum element to its correct position
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

}
