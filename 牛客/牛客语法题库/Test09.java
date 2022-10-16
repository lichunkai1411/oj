package 牛客语法题库;

import java.util.Scanner;

/**
 * 字符串转ASCII码
 */
public class Test09 {
    public static void main(String[] args) {
        // 获取用户输入的字符
        Scanner input = new Scanner(System.in);
        // 返回指定索引处的字符
        char string = input.next().charAt(0);
        // 输出对应的ASCII码对应的数值
        System.out.println((int) string);
    }
}