import java.util.Scanner;

public class Text25 {
    // 判断远近
    public static void main(String[] args) {
        Scanner meter = new Scanner(System.in);
        double distance = meter.nextDouble();
        // 读取用户输入的距离
        if (distance < 10000) {
            System.out.println("jin");
            // 如果距离小于10000输出"jin"
        } else {
            System.out.println("yuan");
            // 否则输出"yuan"
        }
    }
}
