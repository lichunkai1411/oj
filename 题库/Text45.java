import java.util.Scanner;

public class Text45 {
    // 求阶乘（小于及等于该数的正整数的积）n!=1×2×3×...×(n-1)×n。
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("请输入一个数：");
        // 读取用户输入
        int input = scan.nextInt();
        // 定义未知数n
        int n = 1;
        // 如果输入小于0
        if (input < 0) {
            // 输出打印error
            System.out.println("error");
            // 否则
        } else {
            // 进入for循环
            for (int i = 1; i <= input; i++) {
                // 未知数乘i并赋值给n
                n = n * i;
            }
            // 输出打印n
            System.out.println(n);
        }
    }
}