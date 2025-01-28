package com.student_record_management;

public class StudentRecord {
    private Student head;

    //Add a student at the beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    //Add a student at the end
    public void addAtEnd(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    //Add a student at a specific position
    public void addAtPosition(int roll, String name, int age, char grade, int position) {
        if (position <= 0) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        Student newStudent = new Student(roll, name, age, grade);
        Student temp = head;
        for (int i = 1; temp != null && i < position; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            addAtEnd(roll, name, age, grade);
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    //Delete a student by roll number
    public void deleteByRollNumber(int roll) {
        if (head == null) return;
        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    //Search for a student by roll number
    public Student searchByRollNumber(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Display all students
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    //Update a student's grade
    public void updateGrade(int roll, char newGrade) {
        Student student = searchByRollNumber(roll);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + roll);
        } else {
            System.out.println("Student not found.");
        }
    }
}