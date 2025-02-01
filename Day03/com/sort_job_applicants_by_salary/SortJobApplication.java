package com.sort_job_applicants_by_salary;

public class SortJobApplication {
    public static void main(String[] args) {
        HeapSort sortSalaries=new HeapSort();
        int[] salaries = new int[]{100000, 200000, 65000, 50000, 45000, 80000, 70000, 90000, 100000};

        System.out.println("Salaries before sorting :");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
        System.out.println();
        sortSalaries.heapSort(salaries);

        System.out.println("Salaries after sorting :");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
    }
}
