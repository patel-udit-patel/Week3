package org.example.comparing_data_structures_for_searching;

import java.util.TreeSet;

public class TreeSetSearch {
    public static long treeSetSearch(TreeSet<Integer> set, int target) {
        long startTime = System.nanoTime();
        boolean exists = set.contains(target);
        return System.nanoTime() - startTime;
    }
}
