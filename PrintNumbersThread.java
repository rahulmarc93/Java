package lab_10;

public class PrintNumbersThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Create and start the thread
        PrintNumbersThread thread = new PrintNumbersThread();
        thread.start();
    }
}
