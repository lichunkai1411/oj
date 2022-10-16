import java.util.Scanner;

public class Text51 {
    // 求偶数因数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入保存到num
        int num = input.nextInt();
        // 偶数因数 定义even等于2
        int even = 2;
        // 定义结果等于0
        int result = 0;
        // 如果用户输入值小于等于0
        if (num <= 0) {
            // 输出打印error
            System.out.println("error");
            result++;
            // 否则
        } else
            // 进入do-while循环
            do {

                // 如果用户输入的值对2取余等于0并且2对2取余等于0
                if (num % even == 0 && even % 2 == 0) {
                    // 输出打印even
                    System.out.println(even);
                    result++;
                }
                even++;
                // 当2小于等于用户输入值
            } while (even <= num);
        // 如果结果等于0
        if (result == 0)
            // 输出打印wu
            System.out.println("wu");
    }
}

