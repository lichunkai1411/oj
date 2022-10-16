import java.util.Scanner;

public class Text16 {
    public static void main(String[] args) {
        // 判断奇偶
        Scanner input = new Scanner(System.in);
        // 接收一个用户输入的值
        int number = input.nextInt();
        // 如果该值被2整除后余数等于0
        if (number % 2 == 0) {
            // 输出"0"
            System.out.println("0");
            // 否则
        } else {
            // 输出"1"
            System.out.println("1");
        }
    }
}