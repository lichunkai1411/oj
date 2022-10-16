package 牛客语法题库;

import java.util.Scanner;

/**
 * 大小写转换
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {        // 使用while循环持续接受用户输入
            String str = input.next();   // 将输入转化为字符串
            System.out.println(str.toLowerCase());  // 调用toLowerCase方法将大写转换为小写
        }
    }
}
