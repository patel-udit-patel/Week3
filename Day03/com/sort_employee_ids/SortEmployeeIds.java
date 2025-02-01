package com.sort_employee_ids;

public class SortEmployeeIds {
    public static void main(String[] args) {
        InsertionSort employeeId=new InsertionSort();

        int[]employeeIds=new int[]{2, 3, 4, 1, 8, 6, 5, 9};

        System.out.println("Employee Ids before sorting :");
        for(int i=0;i<employeeIds.length;i++){
            System.out.print(employeeIds[i]+" ");
        }
        System.out.println();
        employeeId.insertionSort(employeeIds);

        System.out.println("Employee Ids after sorting :");
        for(int i=0;i<employeeIds.length;i++){
            System.out.print(employeeIds[i]+" ");
        }
    }
}
