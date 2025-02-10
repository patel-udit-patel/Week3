package org.example.sorting_large_data_efficiently;
import org.example.search_a_target_in_a_large_dataset.GenerateDataset;
import java.util.Arrays;

public class SortingComparison {

    public static void main(String[] args) {
        // Different dataset sizes
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);
            int[] dataset = GenerateDataset.generateDataset(size);

        long start;
           //  Bubble Sort
            if (size <= 10000) { // Avoid running for very large data
                int[] bubbleData = Arrays.copyOf(dataset, dataset.length);
                start=System.nanoTime();
                BubbleSort.bubbleSort(bubbleData);
                long bubbleTime =System.nanoTime()-start ;
                System.out.println("Bubble Sort Time: " + (bubbleTime / 1e6) + " ms");
            } else {
                System.out.println("Bubble Sort: Unfeasible (>1hr)");
            }
            // Merge Sort
            int[] mergeData = Arrays.copyOf(dataset, dataset.length);
            start=System.nanoTime();
            MergeSort.mergeSort(mergeData, 0, mergeData.length - 1);
            long mergeTime = System.nanoTime()-start;
            System.out.println("Merge Sort Time: " + (mergeTime / 1e6) + " ms");

            // Quick Sort
            int[] quickData = Arrays.copyOf(dataset, dataset.length);
            start=System.nanoTime();
            QuickSort.quickSort(quickData, 0, quickData.length - 1);
            long quickTime = System.nanoTime()-start;
            System.out.println("Quick Sort Time: " + (quickTime / 1e6) + " ms");
        }
    }
}

