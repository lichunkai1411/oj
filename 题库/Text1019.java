import java.util.Scanner;

public class Text1019 {
    // 圆的周长
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入
        int radius = input.nextInt();
        // 打印输出圆周率乘半径乘2
        System.out.println(3.14 * 2 * radius);
    }
}
