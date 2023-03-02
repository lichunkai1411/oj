package 数组.一维数组;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-26
 * Time：11:01
 *
 * @author lck
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 20, 90, 80, 60};
        int max = getMax(arr);
        System.out.println("最高分为：" + max);
        int min = getMin(arr);
        System.out.println("最低分为：" + min);
        int sum = getSum(arr);
        System.out.println("总成绩为：" + sum);
        double averageScore = averageScore(arr);
        System.out.println("平均成绩为：" + averageScore);
        int count = getCount(arr);
        System.out.println("低于平均分的人数为："+count);
    }

    /**
     * 数组中找最大值
     *
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 数组中找最小值
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求数组中总成绩
     *
     * @param arr
     * @return
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 数组中求平均成绩
     */
    public static double averageScore(int[] arr) {
        int sum = getSum(arr);
        // 计算平均分
        double ave = (sum / 1.0) / arr.length;
        return ave;
    }

    /**
     * 统计数组中低于平均值的元素个数
     */
    public static int getCount(int[] arr) {
        int count = 0;
        double averageScore = averageScore(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<averageScore){
                count++;
            }
        }
        return count;
    }
}
