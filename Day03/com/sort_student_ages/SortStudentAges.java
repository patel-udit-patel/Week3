package com.sort_student_ages;

public class SortStudentAges {
    public static void main(String[] args) {
        CountingSort sortStudentAges=new CountingSort();

        int []studentAges=new int[]{11,12,15,14,16,15,17,18,17,19};

        System.out.println("Student ages before sorting :");
        for(int i=0;i<studentAges.length;i++){
            System.out.print(studentAges[i]+" ");
        }
        System.out.println();
        sortStudentAges.countingSort(studentAges, 11, 19);

        System.out.println("Student ages after sorting :");
        for(int i=0;i<studentAges.length;i++){
            System.out.print(studentAges[i]+" ");
        }
    }
}
