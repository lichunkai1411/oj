package 牛客语法题库;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        // 接受用户输入
        Scanner input = new Scanner(System.in);
        // 定义一个长度为3的数组
        int[] array = new int[3];
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            }
        // 输出下标为1的数
        System.out.println(array[1]);
        }
    }

