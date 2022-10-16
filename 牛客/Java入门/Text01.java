package Java入门;

import java.util.Scanner;

/**
 * 类型转换
 */
public class Text01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要转换的小数：");
        double d = input.nextDouble();
        System.out.println((int)d);
    }
}