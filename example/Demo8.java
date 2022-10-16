import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    // 模拟掷骰子
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到掷骰子游戏！");
        System.out.println("游戏开始，请选择（1.大（4-6） 2.小（1-3））");
        int choice = scanner.nextInt();
        Random num = new Random();
        int point = num.nextInt(6) + 1;
        int resule = 0;
        if (point <= 3) {
            resule = 2;
        } else if (point >= 3) {
            resule = 1;
        }
        System.out.println("程序生成的点数是："+point);
        if (choice == resule) {
            System.out.println("恭喜你赢了！");
        } else {
            System.out.println("很遗憾你输了！");
        }
    }
}
