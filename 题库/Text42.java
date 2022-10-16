import java.util.Scanner;

public class Text42 {
    // 累计求和
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        // 定义sum初始化为0
        int sum = 0;
        // 接收一个整数
        int integer = enter.nextInt();
        // 如果这个整数小于1
        if (integer < 1) {
            // 输出"error"
            System.out.println("error");
            // 否则
        } else {
            // 进入for循环计算从1到这个整数到和;后续递增
            for (int i = 1; i <= integer; i++) {
                // i++;
                // 累计求和
                sum += i;
                // sum = sum + i;
                // 累计求和
            }
            // 输出sum
            System.out.println(sum);
        }
    }
}