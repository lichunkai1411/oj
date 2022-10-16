import java.util.Scanner;

public class Text1023 {
    // 长方形面积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入的长和宽
        double length = input.nextDouble();
        double width = input.nextDouble();
        // 长方形面积公式为长乘宽
        System.out.println(length*width);
    }
}
