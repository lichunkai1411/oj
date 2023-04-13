import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-04-13
 * Time：09:24
 */

public class Text008addTwoNumbers {

    public static void main(String[] args) {
        // 创建 Scanner 对象，用于接收用户的输入
        Scanner sc = new Scanner(System.in);
        // 定义长度为 5 的整型数组 arr1
        int[] arr1 = new int[5];
        // 定义长度为 5 的整型数组 arr2
        int[] arr2 = new int[5];
        // 定义长度为 5 的整型数组 arr3，用于存放 arr1 和 arr2 对应元素相加的结果
        int[] arr3 = new int[5];
        // for 循环遍历 arr1 数组，从下标 0 开始，一直到下标为 4
        for (int i = 0; i < arr1.length; i++) {
            // 使用 Scanner 对象的 nextInt 方法获取用户输入的整数，并将其存入 arr1 数组中指定下标位置
            arr1[i] = sc.nextInt();
        }
        // for 循环遍历 arr1 数组，从下标 0 开始，一直到下标为 4
        for (int i = 0; i < arr1.length; i++) {
            // 使用 Scanner 对象的 nextInt 方法获取用户输入的整数，并将其存入 arr2 数组中指定下标位置
            arr2[i] = sc.nextInt();
        }
        // 定义整型变量 con，用于存放进位值，初始化为 0
        int con = 0;
        // for 循环遍历 arr1 数组，从下标 0 开始，一直到下标为 4
        for (int i = 0; i < arr1.length; i++) {
            // 计算 arr1 和 arr2 对应元素相加的结果，并加上上一次循环的进位值
            int sum = arr1[i] + arr2[i] + con;
            // 获取相加结果的个位数，并存入 arr3 数组中指定下标位置
            arr3[i] = sum % 10;
            // 计算相加结果的十位数，并存入 con 变量中，作为下一次循环的进位值
            con = sum / 10;
        }
        // for 循环遍历 arr1 数组，从下标 0 开始，一直到下标为 4
        for (int i = 0; i < arr1.length; i++) {
            // 输出 arr3 数组中指定下标位置的元素
            System.out.print(arr3[i]);
            // 如果当前不是 arr1 数组的最后一位
            if (i != arr1.length - 1) {
                // 输出一个空格
                System.out.print(" ");
            }
        }
        // 如果最终循环结束后，还有进位值
        if (con > 0) {
            // 输出一个空格和数字 1
            System.out.println(" " + "1");
        }
    }
}