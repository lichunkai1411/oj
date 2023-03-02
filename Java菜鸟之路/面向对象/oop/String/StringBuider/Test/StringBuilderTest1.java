package 面向对象.oop.String.StringBuider.Test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：14:17
 * @author lck
 */
public class StringBuilderTest1 {
    /**
     *  需求：键盘接收一个字符串，程序判断出该字符串是否对称字符串(回文字符串)，并在控制台打印是或不是
     *          对称字符串：123321、111
     *          非对称字符串：123123
     *
     *  思路：对拿到的字符串进行反转，反转后，跟原数据相同，判定为回文字符串
     *
     *          String ---> StringBuilder
     *
     *                      String s = "abc";
     *                      StringBuilder sb = new StringBuilder(s);
     *          StringBuilder ---> String
     *
     *                      String s = sb.toString();
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个对称字符串：");
        String content = scanner.nextLine();
        // 将String转换为StringBuilder，为了调用内部反转的方法
        StringBuilder sb = new StringBuilder(content);
        sb.reverse();
        // 判断反转后的内容，和原数据是否相同
        if (content.equals(sb.toString())){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
