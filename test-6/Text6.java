import java.util.Scanner;

public class Text6 {
    // 输入三角形底边长度和高
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double high = scanner.nextDouble();
        double bottom = scanner.nextDouble();
        // 读取用户输入的高和底边长
        if (high > 0 && bottom > 0) {
            // 如果高和底边都大于0
            System.out.println(high * bottom / 2);
            // 输出底乘高除以二
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }

    }
}