package parallel;

import util.MatrixGenerator;

import java.util.Date;

public class ParallelIndividualMain {
    public static void main(String[] args) {
        double[][] A = MatrixGenerator.generate(2000, 2000);
        double[][] B = MatrixGenerator.generate(2000, 2000);
        double[][] C = new double[A.length][B.length];
        ParallelIndividualMultiplier.multiply(A, B, C);
        Date start = new Date();
        ParallelIndividualMultiplier.multiply(A, B, C);
        Date end = new Date();
        System.out.printf("Parallel Individual: %d%n", end.getTime() - start.getTime());
    }
}
