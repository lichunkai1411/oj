package group;

public class GroupMultiplierTask implements Runnable {
    private final double [][]A;
    private final double [][]B;
    private final double [][]C;

    private final int start;
    private final int end;
    public GroupMultiplierTask(double[][]A, double[][]B, double[][]C,int start,int end) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int row = start;  row<end; row++) {
            for (int col = start; col < end; col++) {
                C [row][col]= 0;
                for (int k = 0; k < A[row].length; k++) {
                    C[row][col] += A[row][k] * B[k][col];
                }
            }
        }
    }
}
