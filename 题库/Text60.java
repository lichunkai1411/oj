import java.util.Scanner;

public class Text60 {
    // 是否为回文数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入
        int num = input.nextInt();
        // 定义y初始值等于0
        int y = 0;
        // 将num赋值给n
        int n = num;
        // 进入while循环
        // 当输入大于0
        while (num > 0) {
            //
            y = y * 10 + num % 10;
            num = num / 10;
        }
        if (y == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}