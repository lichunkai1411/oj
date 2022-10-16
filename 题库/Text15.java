import java.util.Scanner;

public class Text15 {
    public static void main(String[] args) {
//        车速检测
        Scanner input = new Scanner(System.in);
//        读取用户输入如果speed在大于等于0到60范围内输出"正常"大于60输出"chaoshu"
        int speed = input.nextInt();
        // 如果车速大于等于0
        if (speed >= 0) {
            // 如果车速大于60
            if (speed > 60) {
                // 输出打印chaoshu
                System.out.println("chaosu");
                // 否则
            } else {
                // 输出打印zhengchang
                System.out.println("zhengchang");
            }
        }
    }
}