package org.example.recursive_vs_iterative_fibonacci_computation;

public class FibonacciComparison {
    public static void main(String[] args) {
        int[] n = new int[]{10, 30, 500}; // Change this value to test different cases

        for (int i : n) {
            System.out.println("Comparing Recursive vs Iterative Fibonacci Computation...");

            long startRecursive = System.currentTimeMillis();
            int fibRecursive = FibonacciRecursive.fibonacciRecursive(i);
            long timeRecursive = System.currentTimeMillis() - startRecursive;

            long startIterative = System.currentTimeMillis();
            int fibIterative = FibonacciIterative.fibonacciIterative(i);
            long timeIterative = System.currentTimeMillis() - startIterative;

            System.out.println("Fibonacci(" + i + ") Recursive: " + fibRecursive + " | Time: " + timeRecursive + " ms");
            System.out.println("Fibonacci(" + i + ") Iterative: " + fibIterative + " | Time: " + timeIterative + " ms");
            System.out.println();
        }
    }
}
