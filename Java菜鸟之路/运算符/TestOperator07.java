package 运算符;

import java.util.Scanner;

// TODO:测试条件（三元）运算符的用法
public class TestOperator07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        String a = score < 60 ? "不合格" : "合格";
        System.out.println(a);

        int X = input.nextInt();
        int flag = X > 0 ? 1 : (X == 0 ? 0 : -1);
        System.out.println(flag);

    }
}
