package Java面向对象编程.方法;

import java.util.Scanner;

/**
 * 定义一个方法处理公司的迟到问题：
 * (1)输入：迟到时间、月薪
 * (2)处理逻辑：
 * 1.迟到1-10分钟，警告。
 * 2.迟到11-20分钟，罚款一百。
 * 3.迟到21-30分钟，罚款二百。
 * 4.迟到30分钟以上，扣除半日工资。
 * 5.迟到一小时以上，扣除一日工资。
 * 输出：罚款金额
 */
public class TestMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("迟到了几分钟：");
        int a = input.nextInt();
        System.out.println("月薪是多少：");
        int b = input.nextInt();
        handleLate(a, b);
    }
    public static int handleLate(int lateMinutes, int monthSalary) {
        int fine = 0;
        int daySalary = (int) (monthSalary / 22.5);   // 全年工作日平均数
        System.out.println("迟到了：" + lateMinutes + "分钟");
        System.out.println("月薪:" + monthSalary);
        if (lateMinutes < 10) {
            System.out.println("警告你奥！下次注意！");
        } else if (lateMinutes <= 20) {
            System.out.println("罚款100元！活该！");
            fine = 100;
        } else if (lateMinutes <= 30) {
            System.out.println("罚款200元！该罚！");
            fine = 200;
        } else if (lateMinutes <= 60) {
            System.out.println("罚款半日工资！真厉害你！");
            fine = daySalary / 2;
        } else {
            System.out.println("扣除一日工资！你还来干什么！");
            fine = daySalary;
        }

        return fine;
    }
}
