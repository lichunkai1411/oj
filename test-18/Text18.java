import java.util.Scanner;

public class Text18 {
    // 个位是几
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        // 读取用户输入一个数
        if ((d % 10) == 5) {
            // 如果这个数对10取余等于5
            System.out.println("yes");
            // 输出"yes"
        } else {
            // 否则
            System.out.println("no");
            // 输出"no"
        }

    }
}