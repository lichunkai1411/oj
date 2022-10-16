import java.util.Scanner;

public class Text8 {
    // 成绩评级
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的值
        int score = input.nextInt();
        // 如果大于等于80小于等于100
        if (score >= 80 && score <= 100) {
            // 输出"perfect"
            System.out.println("perfect");
            // 否则如果大于等于60小于80
        } else if (score >= 60 && score < 80) {
            // 输出great
            System.out.println("great");
            // 否则如果大于等于0小于60
        } else if (score >= 0 && score < 60) {
            // 输出"emm"
            System.out.println("emm");
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }
    }
}