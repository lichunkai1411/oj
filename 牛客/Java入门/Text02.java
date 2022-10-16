package Java入门;

import java.util.Scanner;

/**
 * 简单运算
 */
public class Text02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        // 如果a小于b将a和b调换位置
        if (a<b)a=a+b-(b=a);
        System.out.printf("%d %d %d %d %d",a+b,a-b,a*b,a/b,a%b);
    }
}
