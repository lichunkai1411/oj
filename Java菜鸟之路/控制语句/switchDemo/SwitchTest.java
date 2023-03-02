package 控制语句.switchDemo;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-25
 * Time：10:34
 *
 * @author lck
 */
public class SwitchTest {
    public static void main(String[] args) {
        switchTest();
    }

    public static void switchTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int week = scanner.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("您的输入有误！");
        }
    }
}
