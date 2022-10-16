import java.util.Scanner;

public class Text1120 {
    // 字符串截取
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取字符串
        String string = "Welcome to the world of Java!";
        // 接收用户输入的两个值
        // 声明a
        int a = input.nextInt();
        // 声明b
        int b = input.nextInt();
        // 如果a大于字符串长度或者b小于0
        if (a > string.length() || b < 0) {
            // 输出打印空字符串
            System.out.println();
            // 否则如果a小于0并且b小于等于字符串长度
        } else if (a < 0 && b <= string.length()) {
            // 定义a等于0
            a = 0;
            // 使用substring() 方法返回字符串的子字符串保存到s1中
            String s1 = string.substring(a, b);
            // 输出打印s1
            System.out.println(s1);
            // 否则如果a大于等于0并且b大于字符串的长度
        } else if (a >= 0 && b > string.length()) {
            // 定义b等于字符串的长度
            b = string.length();
            // 使用substring() 方法返回字符串的子字符串保存到s1中
            String s1 = string.substring(a, b);
            // 输出打印s1
            System.out.println(s1);
            // 否则如果a小于0并且b大于字符串的长度
        } else if (a < 0 && b > string.length()) {
            // 定义a等于0
            a = 0;
            // 定义b等于字符串长度
            b = string.length();
            // 使用substring() 方法返回字符串的子字符串保存到s1中
            String s1 = string.substring(a, b);
            // 输出打印s1
            System.out.println(s1);
            // 否则
        } else {
            // 使用substring() 方法返回字符串的子字符串保存到s1中
            String s1 = string.substring(a, b);
            // 输出打印s1
            System.out.println(s1);
        }
    }
}
