package 牛客语法题库;

import java.util.Scanner;

/**
 * 个位是几
 */
public class Text25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        System.out.println("个位是："+num%10);
    }
}
