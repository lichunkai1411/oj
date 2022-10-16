import java.util.Scanner;

public class Text1082 {
    // 心率检测
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取病人心率
        double heartrate = sc.nextDouble();
        // 如果心率大于160或者小于40
        if (heartrate > 160 || heartrate < 40) {
            // 输出打印请就医
            System.out.println("请就医");
            // 否则如果心率大于100
        } else if (heartrate > 100) {
            // 输出打印窦性心动过速
            System.out.println("窦性心动过速");
            // 否则如果心率小于60
        } else if (heartrate < 60) {
            // 输出打印窦性心动过缓
            System.out.println("窦性心动过缓");
            // 否则
        } else {
            // 输出打印正常
            System.out.println("正常");
        }

    }
}