import java.util.Scanner;

public class Text8 {
    // 成绩评级
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // 读取用户输入的值
        if (a >= 80 && a <= 100) {
            // 如果大于等于80小于等于100
            System.out.println("perfect");
            // 输出"perfect"
        } else if (a >= 60 && a < 80) {
            // 否则如果大于等于60小于80
            System.out.println("great");
            // 输出great
        } else if (a >= 0 && a < 60) {
            // 否则如果大于等于0小于60
            System.out.println("emm");
            // 输出"emm"
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }
    }
}