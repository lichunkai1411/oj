import java.util.Scanner;

public class Text1028 {
    // 圆柱体体积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的半径和高
        int radius = input.nextInt();
        int high = input.nextInt();
        // 声明圆周率
        double PI = 3.14;
        // 圆柱体面积公式为底面积乘高
        System.out.println((Math.pow(radius,2)*PI*high));
    }
}
