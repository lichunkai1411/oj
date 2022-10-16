package parallel;

import java.util.ArrayList;
import java.util.List;

public class ParallelIndividualMultiplier {
    public static void multiply(double[][] A, double[][] B, double[][] C) {
        List<Thread> threads = new ArrayList<>();
        int rows = A.length;
        int cols = B[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                IndividualMultiplierTask task = new IndividualMultiplierTask(C, A, B, i, j);
                Thread thread = new Thread(task);
                thread.start();
                threads.add(thread);
                if (threads.size() % 10 == 0) {
                    waitForThreads(threads);
                }
            }
        }
    }

    public static void waitForThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}
