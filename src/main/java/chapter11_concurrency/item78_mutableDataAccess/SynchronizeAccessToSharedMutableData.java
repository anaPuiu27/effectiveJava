package chapter11_concurrency.item78_mutableDataAccess;

import java.util.concurrent.TimeUnit;

public class SynchronizeAccessToSharedMutableData {

    //Synchronization is required for reliable communication between threads as well as for mutual exclusion
    //Do not use Thread.stop
    //Synchronization is not guaranteed to work unless both read and write operations are synchronized

    //confine mutable data to a single thread

    private static boolean stopRequested;

    // add synchronized setter or getter or make the field volatile

    public static void main(String[] args) throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) i++;
        });

        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
