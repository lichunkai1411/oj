import java.util.Scanner;

public class Text25 {
    // 判断远近
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的距离
        double distance = input.nextDouble();
        // 如果距离小于10000
        if (distance < 10000) {
            // 输出"jin"
            System.out.println("jin");
            // 否则
        } else {
            // 输出"yuan"
            System.out.println("yuan");
        }
    }
}
