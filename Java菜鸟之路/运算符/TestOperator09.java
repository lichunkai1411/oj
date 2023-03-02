package 运算符;

import java.util.Scanner;

/**
 * 三个数比较最大值
 *
 * @author lck
 */
public class TestOperator09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int tempMax = num1 > num2 ? num1 : num2;
        int max = tempMax > num3 ? tempMax : num3;
        System.out.println(max);


    }
}
