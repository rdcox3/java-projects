/*
Ron Cox
Java 605.201.83
Assignment 11
*/

public class Job {
    private int jobId;
    private int printTime; // in seconds

    public Job(int jobId, int printTime) {
        this.jobId = jobId;
        this.printTime = printTime;
    }

    public int getJobId() {
        return jobId;
    }

    public int getPrintTime() {
        return printTime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", printTime=" + printTime +
                " seconds}";
    }
}//end class Job
