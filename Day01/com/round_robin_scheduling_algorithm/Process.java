package com.round_robin_scheduling_algorithm;

public class Process {
    public Process next;
    int processId;
    int burstTime;
    int priority;

    Process(int processId,int burstTime,int priority){
        this.processId=processId;
        this.burstTime=burstTime;
        this.priority=priority;
        this.next=null;
    }
}
