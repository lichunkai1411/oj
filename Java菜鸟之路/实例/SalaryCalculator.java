package 实例;
import java.util.Scanner;
/**
 * 1.通过键盘输入用户的月薪，每年是几个月薪水。
 * 2.输入用户年薪
 * 3.输出一行字"如果年薪超过10万，恭喜你超过90%的国人"，"如果年薪超过20万，恭喜你超过98%的国人。"
 * 4.直到键盘输入数字88，则退出程序（使用break退出循环）
 * 5.键盘输入66，直接显示"重新开始计算……"，然后算下一个用户的年薪。
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******我的薪水计算器******");
        System.out.println("1.输入88，退出程序\n2.输入66，计算下一个年薪");
        while (true) {
            System.out.println("请输入月薪：");
            int monthSalary = input.nextInt();
            System.out.println("请输入一年几个月薪资：");
            int months = input.nextInt();
            int yearSalary = monthSalary * months;    //年薪
            System.out.println("年薪是：" + yearSalary);
            if (yearSalary > 200000) {
                System.out.println("恭喜你超过98%的国人!");
            } else if (yearSalary >= 100000) {
                System.out.println("恭喜你超过90%的国人!");
            } else {
                System.out.println("继续努力吧！");
            }
            System.out.println("输入88，退出程序\t输入66，计算下一个年薪");
            int comm = input.nextInt();
            if (comm == 88) {
                System.out.println("系统退出！");
                break;
            }
            if (comm == 66) {
                System.out.println("继续计算下一个薪资水平！");
                continue;
            }
        }
    }
}
