/*
Ron Cox
Java 605.201.83
Assignment 11
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PrintQueue {
    private Queue<Job> queue = new LinkedList<>();
    private int nextJobId = 1;

    public void addJob(int printTime) {
        Job job = new Job(nextJobId++, printTime);
        queue.add(job);
        System.out.println("Added job ID " + job.getJobId() + " with print time " + job.getPrintTime() + " seconds.");
    }

    public void displayJobs() {
        if (queue.isEmpty()) {
            System.out.println("No jobs in the queue.");
        } else {
            for (Job job : queue) {
                System.out.println(job);
            }
        }
    }
}//end class PrintQueue
