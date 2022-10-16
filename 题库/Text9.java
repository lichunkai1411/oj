import java.util.Scanner;

public class Text9 {
    // 周三干什么
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 接收两个值
        int day = input.nextInt();
        int money = input.nextInt();
        // 一周为七天
        if (day <= 7 && day >= 0) {
            // 如果是周三
            if (day == 3) {
                // 钱数大于100或者大于100
                if (money >= 100) {
                    // 输出"pizza"
                    System.out.println("pizza");
                    // 否则
                } else {
                    // 输出"water"
                    System.out.println("water");
                }
                // 否则
            } else {
                // 输出"study"
                System.out.println("study");
            }
            // 否则
        } else {
            // 输出"error
            System.out.println("error");
        }
    }
}