import java.util.Scanner;

public class Text43 {
    // 条件求和
    public static void main(String[] args) {
        //输入两个数a,b,求出 [a,b]区间内既能被3整除又能被5整除还能被2整除的和
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        // 定义sum初始值为0
        int sum = 0;
        // 如果a<b
        if (a < b) {
            // 进入for循环从a到b+1；i递增
            for (int i = a; i < b + 1; i = i + 1) {
                // 如果i能够被3整除并且能被5整除并且能被2整除
                if (i % 3 == 0 && i % 5 == 0 && i % 2 == 0) {
                    // sum+i再赋值给sum
                    sum = sum + i;
                }
            }
            // 否则
        } else {
            // 进入for循环从b到a+1；i递增
            for (int i = b; i < a + 1; i = i + 1) {
                // 如果i能够被3整除并且能被5整除并且能被2整除
                if (i % 3 == 0 && i % 5 == 0 && i % 2 == 0) {
                    // sum+i再赋值给sum
                    sum = sum + i;
                }
            }
        }
        // 输出打印sum
        System.out.println(sum);
    }
}
