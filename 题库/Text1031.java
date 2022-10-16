import java.util.Scanner;

public class Text1031 {
    // 偶数还是奇数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的数
        int num = input.nextInt();
        // 进入if循环
        // 如果能被2整除
        if (num % 2 == 0) {
            // 输出打印偶数
            System.out.println("偶数");
            // 否则
        } else {
            // 输出打印奇数
            System.out.println("奇数");
        }
    }
}
