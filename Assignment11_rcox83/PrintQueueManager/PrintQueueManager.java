/*
Ron Cox
Java 605.201.83
Assignment 11
*/

public class PrintQueue {
    private LinkedList<Job> jobs = new LinkedList<>();
    private int nextJobId = 1;

    public void addJob(int printTime) {
        Job job = new Job(nextJobId++, printTime);
        jobs.add(job);
        System.out.println("Added job ID " + job.jobId + " with print time " + job.printTime + " seconds.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintQueue printQueue = new PrintQueue();
        Random rnGenerator = new Random();

        System.out.println("Welcome to the Print Queue Manager!");
        while (true) {
            System.out.println("Enter 'add' to add a job to the queue or 'quit' to exit and display the queue:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("add")) {
                int printTime = rnGenerator.nextInt(1000) + 10; // 10 to 1000 seconds
                printQueue.addJob(printTime);
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting and displaying all jobs in the queue:");
                for (Job job : printQueue.jobs) {
                    System.out.println(job);
                }
                break;
            }
        }
    }
} //end class
