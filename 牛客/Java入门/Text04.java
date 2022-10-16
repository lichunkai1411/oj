package Java入门;

import java.util.Scanner;

/**
 * 交换变量值
 */
public class Text04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要交换的两个数:");
        int a = input.nextInt();
        int b = input.nextInt();
        a = a+b-(b=a);
        System.out.println(a+" "+b);
    }
}
