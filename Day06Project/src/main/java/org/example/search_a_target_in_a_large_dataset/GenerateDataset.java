package org.example.search_a_target_in_a_large_dataset;
import java.util.Random;
public class GenerateDataset {
    // Generate an array of random integers
    public static int[] generateDataset(int size) {
        Random rand = new Random();
        int[] dataset = new int[size];
        for (int i = 0; i < size; i++) {
            dataset[i] = rand.nextInt(size * 10); // Random values within range
        }
        return dataset;
    }

}
