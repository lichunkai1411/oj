package 牛客语法题库;

import java.util.Scanner;

/**
 * 实现四舍五入
 */
public class Test10 {
    public static void main(String[] args) {
        // 接受用户输入的数
        Scanner input = new Scanner(System.in);
        // 将用户输入的数字保存到变量a中
        double a = input.nextDouble();
        // 如果变量a大于等于0
        int b;
        if (a >= 0) {
            // 变量a加0.5并强制转型为整型并赋值给变量b
            b = (int) (a + 0.5);
            // 输出数值
        } else {
            // 变量a减0.5并强制转型为整型并赋值给变量b
            b = (int) (a - 0.5);
            // 输出数值
        }
        System.out.println(b);
    }
}
