import java.util.Scanner;

public class Text1034 {
    // 是否超速
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入的车速
        int speed = input.nextInt();
        // 进入if循环
        // 判断速度是否大于80
        // 如果速度大于80
        if (speed > 80) {
            // 输出打印超速了
            System.out.println("超速了");
            // 否则
        } else {
            // 输出打印没超速
            System.out.println("没超速");
        }
    }
}
