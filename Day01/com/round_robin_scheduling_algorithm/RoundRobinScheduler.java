package com.round_robin_scheduling_algorithm;

public class RoundRobinScheduler {
        private Process head;
        private Process tail;
        private int timeQuantum;

        public RoundRobinScheduler(int timeQuantum) {
            this.head = null;
            this.tail = null;
            this.timeQuantum = timeQuantum;
        }

        public void addProcess(int pid, int burstTime, int priority) {
            Process newProcess = new Process(pid, burstTime, priority);
            if (head == null) {
                head = newProcess;
                tail = newProcess;
                tail.next = head;
            } else {
                tail.next = newProcess;
                tail = newProcess;
                tail.next = head;
            }
        }

        public void execute() {
            if (head == null) return;
            int totalWaitingTime = 0;
            int totalTurnaroundTime = 0;
            int completedProcesses = 0;
            Process curr = head;

            while (curr != null) {
                if (curr.burstTime > 0) {
                    int execTime = Math.min(timeQuantum, curr.burstTime);
                    curr.burstTime -= execTime;
                    if (curr.burstTime == 0) {
                        totalTurnaroundTime += execTime + totalWaitingTime;
                        completedProcesses++;
                        removeProcess(curr.processId);
                    } else {
                        totalWaitingTime += execTime;
                    }
                }
                curr = curr.next;
                if (curr == head) break;
            }

            System.out.println("Average Waiting Time: " + (float) totalWaitingTime / completedProcesses);
            System.out.println("Average Turnaround Time: " + (float) totalTurnaroundTime / completedProcesses);
        }

        public void removeProcess(int pid) {
            if (head == null) return;
            Process curr = head, prev = null;
            do {
                if (curr.processId == pid) {
                    if (curr == head && head.next == head) {
                        head = null;
                        tail = null;
                        return;
                    }
                    if (curr == head) {
                        tail.next = head.next;
                        head = head.next;
                    } else {
                        prev.next = curr.next;
                        if (curr == tail) tail = prev;
                    }
                    return;
                }
                prev = curr;
                curr = curr.next;
            } while (curr != head);
        }

        public void displayQueue() {
            if (head == null) {
                System.out.println("No processes in queue.");
                return;
            }
            Process temp = head;
            do {
                System.out.println("Process ID: " + temp.processId + " | Burst Time: " + temp.burstTime + " | Priority: " + temp.priority);
                temp = temp.next;
            } while (temp != head);
        }
    }
