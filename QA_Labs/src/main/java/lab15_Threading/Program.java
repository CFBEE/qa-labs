package lab15_Threading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program implements Runnable {

    private final String message;
    private final String filePath;

    // Constructor lets each thread have its own message
    public Program(String message, String filePath) {
        this.message = message;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        // Only one thread at a time can enter this block
        synchronized (Program.class) {
            try (FileWriter fw = new FileWriter(filePath, true);
                 PrintWriter pw = new PrintWriter(fw)) {
                System.out.println(Thread.currentThread().getName() + " wrote: " + message);
            } catch (IOException e) {
                System.err.println("Error writing to pw.println(message file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // File is in project root, alongside src/
        String filePath = "shared_file.txt";

        // Create Runnable tasks
        Runnable task1 = new Program("Thread 1 wrote this message", filePath);
        Runnable task2 = new Program("Thread 2 wrote this message", filePath);
        Runnable task3 = new Program("Thread 3 wrote this message", filePath);

        // Wrap tasks in Thread objects
        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        Thread t3 = new Thread(task3, "Thread-3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
