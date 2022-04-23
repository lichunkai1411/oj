import java.util.Scanner;

// TODO:未知错误
public class Text22 {
    // 判断正方形
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        double side1 = enter.nextDouble();
        double side2 = enter.nextDouble();
        // 读取用户输入的两条边
        // if (side1 == side2) {
        // 如果两边相等输出"changfangti"
        //  System.out.println("zhengfangxing");
        // } else if (side1 <= 0 || side2 <= 0) {
        // System.out.println("error");
        // 否则如果第一条边或者第二条边小于等于0输出"error"
        // } else {
        // System.out.println("cahngfangti");
        // 否则输出"changfangti"
        if (side1 <= 0 || side2 <= 0) {
            // 如果边1小于等于0或者边2小于等于0
            System.out.println("error");
            // 输出"error"
        } else {
            // 否则
            if (side1 == side2) {
                // 如果两边相等
                System.out.println("zhengfangxing");
                // 输出正方形
            } else {
                // 否则
                System.out.println("changfangxing");
                // 输出长方形
            }
        }

    }
}
