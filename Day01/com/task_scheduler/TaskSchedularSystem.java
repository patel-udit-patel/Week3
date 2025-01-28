package com.task_scheduler;

import java.util.Scanner;
public class TaskSchedularSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(1, "Complete Report", 2, "2025-02-01");
        scheduler.addTask(2, "Prepare Presentation", 1, "2025-02-05");
        scheduler.addTask(3, "Submit Assignment", 3, "2025-02-10");

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        System.out.println("Cycling through tasks:");
        scheduler.cycleTasks();
        scheduler.cycleTasks();

        System.out.println("Searching for Priority 1 tasks:");
        scheduler.searchByPriority(1);

        System.out.println("Removing Task ID 2:");
        scheduler.removeTask(2);
        scheduler.displayTasks();

        scanner.close();
    }
}
