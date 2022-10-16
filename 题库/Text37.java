import java.util.Scanner;

public class Text37 {
    // 找到bw
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的字符串
        String string = input.next();
        // 判断字符串是否包含bw
        // contains()方法可以用来判断集合中是否含有某元素，若有则返回true，没有则返回false。
        boolean result = string.contains("bw");
        if (result) {
            System.out.println("bwwww");
        } else {
            System.out.println("emmm");
        }
    }
}
