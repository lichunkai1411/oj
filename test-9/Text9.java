import java.util.Scanner;

public class Text9 {
    // 周三干什么
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int money = sc.nextInt();
        // 接收两个值
        if (day <= 7 && day >= 0) {
            // 一周为七天
            if (day == 3) {
                // 如果是周三
                if (money >= 100) {
                    // 钱数大于100或者大于100
                    System.out.println("pizza");
                    // 输出"pizza"
                } else {
                    // 否则
                    System.out.println("water");
                    // 输出"water"
                }
            } else {
                // 否则
                System.out.println("study");
                // 输出"study"
            }
        } else {
            // 否则
            System.out.println("error");
            // 输出"error
        }
    }
}