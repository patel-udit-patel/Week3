package org.example.comparing_data_structures_for_searching;

import java.util.HashSet;

public class HashSetSearch {
    public static long hashSetSearch(HashSet<Integer> set, int target) {
        long startTime = System.nanoTime();
        boolean exists = set.contains(target);
        return System.nanoTime() - startTime;
    }
}
