package 扫描器Scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uName = input.nextLine();
        System.out.println("请输入你的年龄：");
        int age = input.nextInt();
        System.out.println("请输入你的月薪：");
        double monthSalary = input.nextDouble();

        System.out.println("用户名：" + uName);
        System.out.println("年龄：" + age);
        System.out.println("月薪：" + monthSalary);
    }
}
