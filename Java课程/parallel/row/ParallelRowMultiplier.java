package parallel.row;

import java.util.List;
import java.util.ArrayList;

public class ParallelRowMultiplier {
    public static void multiply(double[][] A, double[][] B, double[][] C) {
        List<Thread> threads = new ArrayList<>();
        int rows = A.length;
        for (int i = 0; i < rows; i++) {
            RowMultiplierTask task = new RowMultiplierTask(A, B, C, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);

            if (threads.size() %10 == 0) {
                waitForThreads(threads);
            }
        }
    }
    public static void waitForThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}
