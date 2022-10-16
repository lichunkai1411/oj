import java.util.Scanner;

public class Text4 {
    // 整数边长圆的面积
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取一个值为圆的半径
        double radius = input.nextDouble();
        // 如果这个值大于0
        if (radius > 0) {
            // 输出半径乘以3.14
            System.out.println(radius * 3.14);
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }
    }
}