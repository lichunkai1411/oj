package serial;

public class SeralMultiplier {
    public static void multiply(double[][]A, double[][]B, double[][]C){
        for (int i = 0; i <C.length ; i++) {
            for (int j = 0; j < C[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
}
