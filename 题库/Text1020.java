import java.util.Scanner;

public class Text1020 {
    // 长方形周长
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的长和宽
        int length = input.nextInt();
        int width = input.nextInt();
        // 输出打印长加宽乘2
        System.out.println((length+width)*2);
    }
}
