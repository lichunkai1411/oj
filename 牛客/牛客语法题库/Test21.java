package 牛客语法题库;

import java.util.Scanner;

/**
 * 取余
 */
public class Test21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
            int a = input.nextInt();
        System.out.println("请输入除数：");
            int b = input.nextInt();
            System.out.println("余数为："+a%b);
        }
    }

