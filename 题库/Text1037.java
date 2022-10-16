import java.util.Scanner;

public class Text1037 {
    // 是否超时
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的时间
        int second = input.nextInt();
        // 进入if循环
        // 判断时间是否超时
        // 如果时间小于0秒
        if (second < 0) {
            // 输出打印error
            System.out.println("error");
            // 否则如果时间大于200
        } else if (second > 200) {
            // 输出打印超时
            System.out.println("超时");
            // 否则
        } else {
            // 输出打印当前时间
            System.out.println(second + "秒");
        }
    }
}
