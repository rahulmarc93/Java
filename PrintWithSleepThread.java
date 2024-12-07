package lab_10;

public class PrintWithSleepThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                // Sleep for 500 milliseconds very interesting output
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    public static void main(String[] args) {
        // Create and start the thread
        PrintWithSleepThread thread = new PrintWithSleepThread();
        thread.start();
    }
}
