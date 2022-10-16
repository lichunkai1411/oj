package 牛客语法题库;

import java.util.Scanner;

/**
 * 周几开学
 */
public class Text27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("周几开学：");
        int a = input.nextInt();
        System.out.println("延期多少天：");
        int b = input.nextInt();
        int result = ((a+ b)%7==0?8:(a+b)%7);
        System.out.println("星期"+result);
    }
}
