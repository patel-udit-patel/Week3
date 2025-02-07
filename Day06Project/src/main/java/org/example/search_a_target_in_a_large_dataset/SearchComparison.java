package org.example.search_a_target_in_a_large_dataset;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000}; // Different dataset sizes

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] dataset = GenerateDataset.generateDataset(size);
            int target = dataset[new Random().nextInt(size)]; // Random target

            // Linear Search Time
            long start = System.nanoTime();
            LinearSearch.linearSearch(dataset, target);
            long linearTime = System.nanoTime() - start;
            System.out.println("Linear Search Time: " + (linearTime / 1e6) + " ms");

            // Sort dataset for Binary Search
            start = System.nanoTime();
            Arrays.sort(dataset);
            long sortTime = System.nanoTime() - start;

            // Binary Search Time
            start = System.nanoTime();
            BinarySearch.binarySearch(dataset, target);
            long binaryTime = System.nanoTime() - start;
            System.out.println("Binary Search Time: " + (binaryTime / 1e6) + " ms");

            // Sorting Time (since Binary Search needs sorted data)
            System.out.println("Sorting Time: " + (sortTime / 1e6) + " ms");
        }
    }
}
