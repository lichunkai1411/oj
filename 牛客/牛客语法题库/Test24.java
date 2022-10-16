package 牛客语法题库;

import java.util.Scanner;

/**
 * 求商带余
 */
public class Test24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数：");
            int a = input.nextInt();
        System.out.println("请输入除数：");
            int b = input.nextInt();
            int business = a/b;
            int remainder = a-b*business;
            System.out.println("商为："+business+"  "+"余数为："+remainder);
        }
    }

