package Java面向对象编程.方法的重载;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-25
 * Time：09:22
 *
 * @author lck
 */
public class OverloadDemo {
    public static void main(String[] args) {
            byScore();
    }

    public static void byScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("奖励自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("奖励游乐场玩一次");
            } else if (score >= 80 && score < 89) {
                System.out.println("奖励变形金刚一个");
            } else if (score < 80) {
                System.out.println("挨揍");
            }
        }else {
            System.out.println("输入的成绩有误");
        }
    }
}
