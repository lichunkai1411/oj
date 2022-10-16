package Java入门;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Text08 {
    public static void main(String[] args) {
        // 接收用户输入
        Scanner input = new Scanner(System.in);
        // 将用户输入的邮箱保存到into中
        String into = input.next();
        // 正则表达式
        String regexEmail="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        Matcher matcher = Pattern.compile(regexEmail).matcher(into);
        System.out.println(matcher.find() ? "邮箱格式合法" : "邮箱格式不合法");
    }
}
