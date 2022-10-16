import java.util.Scanner;

public class Text47 {
    // 平均年龄
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 定义总数
        int total = 0;
        // 进入for循环；读取5个数作为年龄
        for (int i = 1; i < 6; i++) {
            // 读取用户输入的年龄
            int age = input.nextInt();
            // 如果年龄小于等于0或者大于130
            if (age <= 0 || age > 130) {
                // 输出打印error
                System.out.println("error");
                // 结束
                break;
            }
            // 总数加年龄再赋值给总数
            total += age;
        }
        // 输出打印总数除以5
        System.out.println(total / 5);
    }
}
