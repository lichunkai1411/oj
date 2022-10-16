import java.util.Scanner;

public class Text1033 {
    // 成年了吗
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的年龄
        int age = input.nextInt();
        // 进入if循环
        // 判断年龄是否大于18
        // 如果年龄大于18
        if (age >= 18) {
            // 输出打印成年
            System.out.println("成年");
            // 否则
        } else {
            // 输出打印未成年
            System.out.println("未成年");
        }
    }
}
