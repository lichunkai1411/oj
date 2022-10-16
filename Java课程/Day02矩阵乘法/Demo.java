package Day02矩阵乘法;

/**
 * 矩阵乘法
 * (1)矩阵
 * 线性代数中的计算对象
 * (2)矩阵乘法
 * 矩阵基本运算，一个m行n列的矩阵A，和一个m行p列的矩阵B相乘，会得到一个m行n列的矩阵C
 * 经常被应用在图像处理、机器学习等技术中
 * 算法实现
 * (1)如何表示矩阵？
 * 二维数组
 * (2)如何实现矩阵相乘
 * 循环遍历目标二维数组，根据矩阵乘法规则算出结果保存？
 * (3)当矩阵很大时，计算速度很慢，如何提升计算速度？
 * 使用并发计算，设计一个并发算法，使得多个计算任务同时进行
 */
public class Demo {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = (i+1)*(j+1);
                B[i][j] = (i+1)*(j+1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j]+= A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
