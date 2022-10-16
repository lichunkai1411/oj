package 常量;

import java.util.Scanner;

public class TestCircumference {
    // 圆的周长
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 声明常量PI
        final double PI = 3.14;
        System.out.println("请输入半径：");
        // 读取用户输入的半径
        double radius = input.nextDouble();
        double circle = 2 * PI * radius;
        double area = PI * Math.pow(radius, 2);
        System.out.println("周长为" + circle);
        System.out.println("面积为" + area);
    }
}
