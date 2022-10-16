package 牛客语法题库;

import java.util.Scanner;

/**
 * 缩短二进制
 * "%d"表示以十进制整数形式输出
 * "%o"表示以八进制形式输出
 * "%x"表示以十六进制输出
 * "%X"表示以十六进制输出,并且将字母(A、B、C、D、E、F)换成大写
 * "%e"表示以科学计数法输出浮点数
 * "%E"表示以科学计数法输出浮点数,而且将e大写
 * "%f"表示以十进制浮点数输出,在"%f"之间加上".n"表示输出时保留小数点后面n位
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个二进制数");
        int num = input.nextInt();
        System.out.printf("%o", num);
        System.out.println();
        System.out.printf("%x", num);
    }
}
