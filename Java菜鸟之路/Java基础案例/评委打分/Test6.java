package Java基础案例.评委打分;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：13:21
 *
 * @author lck
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = initDate();
        int sum = getSum(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        // 5.(总和-最大值-最小值)/4
        double avg= ((sum-max-min)*1.0)/(arr.length-2);
        System.out.println("选手的最后的得分为：" + avg);
    }
    /*4.求最小值*/
    private static int getMin(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    /*3.求最大值*/
    private static int getMax(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /*2.求和*/
    private static int getSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    /* 1.键盘录入6个评委的打分*/
    private static int[] initDate() {
        int[] arr = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入6个评委的打分：");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分：");
            int score = scanner.nextInt();
            if (score>=0&&score<=100){
               arr[i]= score;
            }else {
                System.out.println("您的分数输入有误，请检查是否是0-100之间的数");
                i--;
            }
        }
        return arr;
    }


}
