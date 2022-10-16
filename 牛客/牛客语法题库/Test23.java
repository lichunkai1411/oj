package 牛客语法题库;

import java.util.Scanner;

/**
 * 买票
 */
public class Test23 {
    public static void main(String[] args) {
        // 定义票价常量
        final double fare = 29.9;
        Scanner input = new Scanner(System.in);
        // 定义人数
        int head = input.nextInt();
        System.out.println(fare * head);
    }
}
