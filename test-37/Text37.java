import java.util.Scanner;

public class Text37 {
    // 找到bw
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 读取用户输入的字符串
        String string = in.next();
        // 判断字符串是否包含bw
        boolean result = string.contains("bw");
        if (result) {
            System.out.println("bwwww");
        } else {
            System.out.println("emmm");
        }
    }
}
