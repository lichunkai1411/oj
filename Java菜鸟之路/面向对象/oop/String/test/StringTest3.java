package 面向对象.oop.String.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：11:19
 * @author lck
 */

import java.util.Scanner;

/**
 * 需求：以字符串形式从键盘接收一个手机号，将中间四位号码屏蔽
 * 最终效果：156****1234
 *
 * 分析：
 *     1.键盘接收字符串
 *     2.截取前三位
 *     3.截取后四位
 *     4.前三位+"****"+后四位
 */
public class StringTest3 {
    public static void main(String[] args) {
       // 1.键盘接收字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNum = scanner.nextLine();
        // 2.截取前三位
        String before = phoneNum.substring(0, 3);
        // 3.截取后四位
        String after = phoneNum.substring(7);
        // 4.前三位+"****"+后四位
        System.out.println(before+"****"+after);
    }
}
