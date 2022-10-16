import java.util.Scanner;

public class Text1084 {
    // 调和级数
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的一个整数
        int num = input.nextInt();
        // 声明浮点数sum初始值为0
        double sum = 0;
        // 如果a小于等于0
        if (num <= 0) {
            // 输出打印error
            System.out.println("error");
            // 否则
        } else {
            // for循环
            for (int N = 1; N <= num; N++) {
                // 将sum加1除N赋值给sum  需要类型转换为浮点数
                sum+=(1/(double)N);
            }
            // 输出打印sum
            System.out.println(sum);
        }
    }
}
