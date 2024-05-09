class Worker extends Thread {
    private int workerId;
    private TaskCoordinator taskCoordinator;

    public Worker(int workerId, TaskCoordinator taskCoordinator) {
        this.workerId = workerId;
        this.taskCoordinator = taskCoordinator;
    }

    public void run() {
        System.out.println("Worker " + workerId + " is working on its part of the task.");
        // Simulate some work
        try {
            sleep((long) (Math.random() * 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker " + workerId + " has finished its part of the task.");

        // Notify task coordinator that this worker has finished its part
        taskCoordinator.workerFinished();
    }
}

class TaskCoordinator {
    private int workersFinished = 0;

    // Method to be called by each worker when it finishes its part
    public synchronized void workerFinished() {
        workersFinished++;
        if (workersFinished == 2) {
            // If both workers have finished, notify waiting threads
            notifyAll();
        }
    }

    // Method to wait until both workers finish their parts
    public synchronized void waitForBothWorkers() {
        while (workersFinished < 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class intercommunicationMain {
    public static void main(String[] args) {
        TaskCoordinator taskCoordinator = new TaskCoordinator();

        // Create and start two worker threads
        Worker worker1 = new Worker(1, taskCoordinator);
        Worker worker2 = new Worker(2, taskCoordinator);
        worker1.start();
        worker2.start();

        // Wait for both workers to finish
        taskCoordinator.waitForBothWorkers();

        // After both workers finish, proceed to the next step
        System.out.println("Both workers have finished their parts. Proceeding to the next step...");
    }
}
