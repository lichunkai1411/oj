package 牛客语法题库;

import java.util.Scanner;

/**
 * 浮点数的个位数
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个浮点数：");
            double num = input.nextDouble();
            System.out.println((int) (num % 10));
        }
    }

