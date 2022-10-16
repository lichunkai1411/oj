import java.util.Scanner;

public class Text1032 {
    // 是否发烧
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入
        double temperature = input.nextDouble();
        // 进入if循环
        // 判断温度是否大于37度
        if (temperature > 37) {
            System.out.println("发烧");
        } else {
            System.out.println("正常");
        }
    }
}
