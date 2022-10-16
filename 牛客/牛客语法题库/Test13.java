package 牛客语法题库;

import java.util.Scanner;

/**
 * 出生日期输入输出
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String time = input.next();
        System.out.println("year=" + time.substring(0, 4));     // substring() 方法返回字符串的子字符串。
        System.out.println("month=" + time.substring(4, 6));
        System.out.println("day=" + time.substring(6));  // / System.out.println("day=" + time.substring(6,8));
    }
}
