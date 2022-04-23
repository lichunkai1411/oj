import java.util.Scanner;

public class Text5 {
    // 整数边长圆的面积
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double radius = r.nextDouble();
        // 读取用户输入的半径
        if (radius > 0) {
            // 如果这个半径大于0
            System.out.println(radius * radius * 3.14);
            // 输出半径平方乘3.14
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }
    }
}