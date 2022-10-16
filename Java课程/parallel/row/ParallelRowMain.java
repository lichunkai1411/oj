package parallel.row;

import util.MatrixGenerator;


import java.util.Date;

public class ParallelRowMain {
    public static void main(String[] args) {
        double[][] A = MatrixGenerator.generate(2000, 2000);
        double[][] B = MatrixGenerator.generate(2000, 2000);
        double[][] C = new double[A.length][B[0].length];
        Date start = new Date();
        ParallelRowMultiplier.multiply(A, B, C);
        Date end = new Date();
        System.out.printf("Parallel Row: %d%n", end.getTime() - start.getTime());
    }
}
