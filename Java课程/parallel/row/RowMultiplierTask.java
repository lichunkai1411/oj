package parallel.row;

public class RowMultiplierTask implements Runnable {
    private final double[][] A;
    private final double[][] B;
    private final double[][] C;

    private final int row;

    public RowMultiplierTask(double[][] A, double[][] B, double[][] C, int row) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
    }

    @Override
    public void run() {
        for (int col = 0; col < B[0].length; col++) {
            C[row][col] = 0;
            for (int k = 0; k < A[row].length; k++) {
                C[row][col] += A[row][k] * B[k][col];
            }
        }
    }
}
