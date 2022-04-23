import java.util.Scanner;

public class Text15 {
    // 车速检测
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        // 读取用户输入
        // if (speed >= 60) {
        // if (speed > 60) {
        // System.out.println("chaosu");
        // } else {
        // System.out.println("zhengchang");
        if (speed > 60) {
            // 如果速度大于60
            System.out.println("chaoshu");
            // 输出超速
        } else if (speed >= 0) {
            // 否则如果速度大于等于0
            System.out.println("zhengchang");
            // 输出正常
        } else {
            // 否则什么也不做
        }
    }
}
