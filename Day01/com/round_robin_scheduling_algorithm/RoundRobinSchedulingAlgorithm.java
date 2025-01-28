package com.round_robin_scheduling_algorithm;

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(1, 10, 3);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 2);
        scheduler.displayQueue();

        System.out.println("Starting Round Robin Scheduling...");
        scheduler.execute();
    }
}
