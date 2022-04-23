import java.util.Scanner;

public class Text7 {
    // 温度检测
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temperature = s.nextDouble();
        // 读取一个值
        if (temperature > 37) {
            // 如果大于37
            System.out.println("didi");
            // 输出"didi"
        } else {
            // 否则
            System.out.println("ok");
            // 输出"OK"
        }
    }
}