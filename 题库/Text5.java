import java.util.Scanner;

public class Text5 {
    // 整数边长圆的面积
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的半径
        double radius = input.nextDouble();
        // 如果这个半径大于0
        if (radius > 0) {
            // 输出半径平方乘3.14
            System.out.println(Math.pow(radius,2) * 3.14);
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }
    }
}