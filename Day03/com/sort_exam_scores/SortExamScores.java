package com.sort_exam_scores;

public class SortExamScores {
    public static void main(String[] args) {
        SelectionSort sortExamScores=new SelectionSort();

        int []examScores=new int[]{1,2,6,5,4,8,7,9,1};

        System.out.println("Exam Scores before sorting :");
        for(int i=0;i<examScores.length;i++){
            System.out.print(examScores[i]+" ");
        }
        System.out.println();
        sortExamScores.selectionSort(examScores);

        System.out.println("Employee Ids after sorting :");
        for(int i=0;i<examScores.length;i++){
            System.out.print(examScores[i]+" ");
        }
    }
}
