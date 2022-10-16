import java.util.Scanner;

public class Text30 {
    // 俄罗斯方块
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的分数
        int score = input.nextInt();
        // 当积分为500的倍数时速度为该积分商的2次方
        int speed = (int) Math.pow(2, score / 500);
        // 关卡数为积分数除2000+1
        int level = score / 2000 + 1;
        // 输出打印当前速度
        System.out.println(speed);
        // 输出打印当前关卡数
        System.out.println(level);
    }
}