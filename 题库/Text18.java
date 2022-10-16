import java.util.Scanner;

public class Text18 {
    // 个位是几
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入一个数
        int number = input.nextInt();
        // 如果这个数对10取余等于5
        if ((number % 10) == 5) {
            // 输出"yes"
            System.out.println("yes");
            // 否则
        } else {
            // 输出"no"
            System.out.println("no");
        }
    }
}