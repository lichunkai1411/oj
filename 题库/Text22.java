import java.util.Scanner;

public class Text22 {
    // 判断正方形
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 接收用户输入的两条边
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        // 如果边1小于等于0或者边2小于等于0
        if (side1 <= 0 || side2 <= 0) {
            // 输出"error"
            System.out.println("error");
            // 否则
        } else {
            // 如果两边相等
            if (side1 == side2) {
                // 输出正方形
                System.out.println("zhengfangxing");
                // 否则
            } else {
                // 输出长方形
                System.out.println("changfangxing");
            }
        }
    }
}
