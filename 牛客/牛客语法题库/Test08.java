package 牛客语法题库;

import java.util.Scanner;

/**
 * 字符菱形
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入要打印的字符
        char zf = scanner.next().charAt(0);

        //上部分的行数，包括对角线
        int n = 3;

        for (int i = 1; i <= n; i++) {
            //输出每行空格且每行空格逐级减少
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //每行要输出的字符个数是 该行的行数的2倍减1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(zf);
            }
            //每行结尾换行
            System.out.println();
        }

        //下部分的行数就是上部分的行数减1
        int m = n - 1;
        for (int i = 1; i <= m; i++) {
            //输出空格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //输出这个字符的个数
            for (int j = 1; j <= 2 * (m - i) + 1; j++) {
                System.out.print(zf);
            }
            //每行结尾换行
            System.out.println();
        }

    }
}