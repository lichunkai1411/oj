import java.util.Scanner;

public class Text39 {
    // 条件求和
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 定义奇数初始值
        int odd = 0;
        // 定义偶数初始值
        int even = 0;
        // 进入for循环接收5个数
        for (int i = 0; i < 5; i++) {
            // 定义number
            int number = input.nextInt();
            // 如果这个数能被2整除
            if (number % 2 == 0) {
                // 累加赋值给even
                even = even + number;
                // 否则
            } else {
                // 累加赋值给odd
                odd = odd + number;
            }
        }
        // 奇数大于偶数
        if (odd > even) {
            // 输出打印奇数
            System.out.println("jishu");
            // 否则如果奇数小于偶数
        } else if (odd < even) {
            // 输出打印偶数
            System.out.println("oushu");
            // 否则
        } else {
            // 输出打印相等
            System.out.println("xiangdeng");
        }
    }
}