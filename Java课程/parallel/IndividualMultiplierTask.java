package parallel;

public class IndividualMultiplierTask implements Runnable {
    private final double[][] C;
    private final double[][] A;
    private final double[][] B;

    private final int row;
    private final int col;

    public IndividualMultiplierTask(double[][] C, double[][] A, double[][] B, int i, int j) {
        this.C = C;
        this.A = A;
        this.B = B;
        this.row = i;
        this.col = j;
    }

    @Override
    public void run() {
        C[row][col] = 0;
        for (int k = 0; k < A[row].length; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}
