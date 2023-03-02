package 面向对象.oop.String.test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：11:39
 * @author lck
 */
public class StringTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String content = scanner.nextLine();
        content = content.replace("TMD", "***");
        System.out.println(content);
    }
}
