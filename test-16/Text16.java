import java.util.Scanner;

public class Text16 {
    public static void main(String[] args) {
        // 判断奇偶
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        // 接收一个用户输入的值
        if (a % 2 == 0) {
            // 如果该值被2整除后余数等于0
            System.out.println("0");
            // 输出"0"
        } else {
            // 否则
            System.out.println("1");
            // 输出"1"
        }
    }
}