package 数组.一维数组;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-27
 * Time：09:15
 * @author lck
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
       /* int[] arr = initArray();
        int max = getMax(arr);
        System.out.println("最大数为："+max);*/


        int[] randomNums = initArrayRandom();
        int min = getMin(randomNums);
        System.out.println("最小值为："+min);
    }

    private static int[] initArrayRandom() {
        Random random  = new Random();
        int [] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i]=random.nextInt(100)+1;
        }
        return randomNums;
    }

    private static int[] initArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个学生成绩：");
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
