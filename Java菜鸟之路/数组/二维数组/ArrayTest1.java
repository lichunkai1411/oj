package 数组.二维数组;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-27
 * Time：12:44
 * @author lck
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int arr [][]= {
                {11,22,33},
                {33,44,55}
        };
        printArray(arr);

        int sum = getSum(arr);
        System.out.println("求和结果为："+sum);
    }

    /**
     * 遍历并打印二维数组中的元素
     * 已知一个二维数组arr = {{11,22,33},{44,55,66}};
     * 遍历该数组，取出所有元素并打印
     */
    public static void printArray(int [] [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    /**
     * 遍历二维数组并求和
     * 已知一个二维数组 arr = {{11,22,33},{44,55,66}};
     * 对内部存储的与元素累加求和，并将结果输出在控制台
     */
    public static int getSum(int[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }return sum;
    }
}
