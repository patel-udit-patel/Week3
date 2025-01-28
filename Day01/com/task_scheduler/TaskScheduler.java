package com.task_scheduler;

// Class for managing the circular linked list
public class TaskScheduler {
    private Task head;

    //Add a task at the end
    public void addTask(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    //Remove a task by ID
    public void removeTask(int id) {
        if (head == null) return;
        Task temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head == head.next) {
                        head = null;
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    //View the current task and move to the next task
    public void cycleTasks() {
        if (head == null) return;
        System.out.println("Current Task: " + head.name + " (Priority: " + head.priority + ")");
        head = head.next;
    }

    //Display all tasks in circular order
    public void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    //Search for tasks by priority
    public void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.name + " (Due Date: " + temp.dueDate + ")");
            }
            temp = temp.next;
        } while (temp != head);
    }
}
