import java.util.Scanner;

public class Text1036 {
    // 钱够吗
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的钱数
        int money = input.nextInt();
        // 进入if循环
        // 判断钱数是否够
        // 如果钱数小于0
        if (money < 0) {
            // 输出打印error
            System.out.println("error");
            // 否则如果钱数大于10000
        } else if (money > 10000) {
            // 输出打印够
            System.out.println("够");
            // 否则
        } else {
            // 输出打印不够
            System.out.println("不够");
        }
    }
}
