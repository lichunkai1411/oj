import java.util.Scanner;

public class Text49 {
    // 求质数  指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 定义一个整形数保存到变量number中
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println("error");
            return;
        }
        // 定义i变量初始值为2
        int i = 2;
        // 当变量i小于number进入while循环
        // 保存结果是否为质数
        boolean result = true;
        while (i < number) {
            // 如果number对i取余不等于0
            if (number % i == 0) {
                // 结束循环
                break;
            }
            // i递增
            i = i + 1;
        }
        // 如果i等于number
        if (result) {
            // 输出打印yes
            System.out.println("shizhishu");
            // 否则
        } else {
            // 输出打印no
            System.out.println("bushizhishu");
        }
    }
}