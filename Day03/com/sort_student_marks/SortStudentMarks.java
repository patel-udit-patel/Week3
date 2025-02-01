package com.sort_student_marks;

public class SortStudentMarks {
    public static void main(String[] args) {
        BubbleSort student=new BubbleSort();
        int []studentMarks= {1, 2, 4, 6, 8, 7, 5};

        System.out.println("Student marks before sorting :");
        for(int i=0;i<studentMarks.length;i++){
            System.out.print(studentMarks[i]+" ");
        }
        System.out.println();
        student.bubbleSort(studentMarks);

        System.out.println("Student marks after sorting :");
        for(int i=0;i<studentMarks.length;i++){
            System.out.print(studentMarks[i]+" ");
        }

    }
}
