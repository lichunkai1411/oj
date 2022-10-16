package 牛客语法题库;

import java.util.Scanner;

/**
 * 十六进制转十进制
 * "%d"表示以十进制整数形式输出
 * "%o"表示以八进制形式输出
 * "%x"表示以十六进制输出
 * "%X"表示以十六进制输出,并且将字母(A、B、C、D、E、F)换成大写
 * "%e"表示以科学计数法输出浮点数
 * "%E"表示以科学计数法输出浮点数,而且将e大写
 * "%f"表示以十进制浮点数输出,在"%f"之间加上".n"表示输出时保留小数点后面n位
 */
 public class Test16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个十六进制数");
        String hes = input.nextLine();
        // 字符串string转16进制int类型
        System.out.printf("%d",Integer.parseInt(hes,16));
    }
}
