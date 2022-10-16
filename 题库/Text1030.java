import java.util.Scanner;

public class Text1030 {
    // 正数还是负数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的数
        int number = input.nextInt();
        // 进入if循环
        // 如果数大于0
        if (number > 0) {
            // 输出打印正数
            System.out.println("正数");
            // 否则如果数小于0
        } else if (number < 0) {
            // 输出打印负数
            System.out.println("负数");
            // 否则
        } else {
            // 输出打印0
            System.out.println(0);
        }
    }
}
