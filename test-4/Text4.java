import java.util.Scanner;

public class Text4 {
    // 整数边长圆的面积
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double radius = r.nextDouble();
        // 读取一个值为圆的半径
        if (radius > 0) {
            // 如果这个值大于0
            System.out.println(radius * 3.14);
            // 输出半径乘以3.14
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }
    }
}