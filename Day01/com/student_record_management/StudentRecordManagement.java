package com.student_record_management;

import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRecord list = new StudentRecord();

        //Adding sample students
        list.addAtEnd(1, "Vinay", 20, 'A');
        list.addAtEnd(2, "Udit", 21, 'B');
        list.addAtEnd(3, "Utkarsh", 22, 'C');

        //Displaying student records
        System.out.println("Student Records:");
        list.displayStudents();

        //Searching for a student
        System.out.println("Searching for Roll Number 2:");
        Student found = list.searchByRollNumber(2);
        if (found != null) {
            System.out.println("Found: " + found.name + " (Grade: " + found.grade + ")");
        } else {
            System.out.println("Student not found.");
        }

        // Updating a student's grade
        System.out.println("Updating Grade for Roll Number 2 to 'A':");
        list.updateGrade(2, 'A');
        list.displayStudents();

        // Deleting a student record
        System.out.println("Deleting Roll Number 1:");
        list.deleteByRollNumber(1);
        list.displayStudents();

    }
}

