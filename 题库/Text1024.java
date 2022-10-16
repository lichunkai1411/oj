import java.util.Scanner;

public class Text1024 {
    // 圆的面积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 定义PI等于3.14
        double PI= 3.14;
        // 声明变量半径
        int radius = input.nextInt();
        // 圆的面积公式为PI乘半径的平方
        System.out.println(Math.pow(radius,2)*PI);
    }
}
