import java.util.Scanner;

public class Text1083 {
    // 数字元素之和
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的一个整数
        int integer = input.nextInt();
        // 定义sum初始值为0
        int sum = 0;
        // 如果这个数小于等于0
        if (integer <= 0) {
            // 将这个数的负值赋值给这个数
            integer = -integer;
        }
        // 将这个数赋值给i
        int i = integer;
        // 进入while循环
        // 当i大于0
        while (i > 0) {
            // 将sum加i对10取余赋值给sum
            sum += i % 10;
            // 将i对10取余赋值给i
            i /= 10;
        }
        // 输出打印sum
        System.out.println(sum);
    }
}