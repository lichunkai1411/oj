package group;

import java.util.ArrayList;
import java.util.List;


public class ParallelGroupMultiplier {
    public static void multiply(double[][] A, double[][] B, double[][] C) {
        List<Thread> threads = new ArrayList<>();
        int rows = A.length;
        int numThreads = Runtime.getRuntime().availableProcessors();
        //分组
        int step = rows / numThreads;
        int start = 0;
        int end = step;
        for (int i = 0; i < numThreads; i++) {
            GroupMultiplierTask task = new GroupMultiplierTask(A, B, C,start,end);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            start = end;
            end = i == numThreads ? rows:end+step;
        }
        for (Thread thread : threads) {
            try {
                thread.join();
                // 抛出异常
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
