import java.util.Scanner;

public class Text7 {
    // 温度检测
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取一个值
        double temperature = input.nextDouble();
        // 如果大于37
        if (temperature > 37) {
            // 输出"didi"
            System.out.println("didi");
            // 否则
        } else {
            // 输出"OK"
            System.out.println("ok");
        }
    }
}