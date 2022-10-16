package 控制语句;

import java.util.Scanner;
        // TODO:三元运算符
public class threeMath {
    public static void main(String[] args) {
        System.out.println("输入你的成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String a = score>=60?"及格":"不及格";
        System.out.println(a);
    }
}
