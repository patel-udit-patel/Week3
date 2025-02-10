package org.example.comparing_data_structures_for_searching;

import java.util.*;

public class DataStructureSearchComparison {
//main controller method for searching
    public static void main(String[] args) {
        int []number = new int[]{1000, 100000, 10000000};
        for (int N : number) {
            int SEARCH_ELEMENT = N / 2;
            System.out.println("Comparing Different Data Structures for Searching...");

            //initialising array ,hashSet and treeSet
            int[] array = new int[N];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            //adding elements in data structures
            for (int i = 0; i < N; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            long timeArraySearch = ArraySearch.arraySearch(array, SEARCH_ELEMENT);
            long timeHashSetSearch = HashSetSearch.hashSetSearch(hashSet, SEARCH_ELEMENT);
            long timeTreeSetSearch = TreeSetSearch.treeSetSearch(treeSet, SEARCH_ELEMENT);

            System.out.println("Time taken using Array (Linear Search): " + timeArraySearch + " ms");
            System.out.println("Time taken using HashSet (O(1) Search): " + timeHashSetSearch + " ms");
            System.out.println("Time taken using TreeSet (O(log N) Search): " + timeTreeSetSearch + " ms");
            System.out.println();
        }
    }
}

