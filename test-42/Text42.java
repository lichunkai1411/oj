import java.util.Scanner;

public class Text42 {
    // 条件求和
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int sum = 0;
        // 定义sum初始化为0
        int integer = enter.nextInt();
        // 接收一个整数
        if (integer < 1) {
            // 如果这个整数小于1
            System.out.println("error");
            // 输出"error"
        } else {
            // 否则
            for (int i = 1; i <= integer; i++) {
                // 进入for循环计算从1到这个整数到和;后续递增
                // i++;
                sum += i;
                // 累计求和
            }
            System.out.println(sum);
            // 输出sum
        }
    }
}