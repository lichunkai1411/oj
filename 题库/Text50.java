import java.util.Scanner;

public class Text50 {
    // 求质因数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入
        int num = input.nextInt();
        // 如果这个数小于2
        if (num < 2) {
            // 输出打印error
            System.out.println("error");
            // 否则
        } else {
            // 进入for循环
            for (int i = 2; i <= num; i++) {
                // 进入while循环判断
                // 对i取余等于0并且不等于i
                while (num % i == 0 && num != i) {
                    // 将这个数除i赋值给这个数
                    num /= i;
                    // 输出打印i
                    System.out.println(i);
                }
                // 如果等于i
                if (num == i) {
                    // 输出打印i
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}