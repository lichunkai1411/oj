import java.util.Scanner;

public class GetNumber {
    // 猜数字（0-100）
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int again;
        do {
            int answer = (int) (Math.random() * 100);
            int chances = 7;
            while (chances > 0) {
                System.out.println("请猜测一个0-100之间的数字，包含0不包含100：");
                int guess = input.nextInt();
                if (guess < answer) {
                    System.out.println("小了");
                } else if (guess > answer) {
                    System.out.println("大了");
                } else {
                    System.out.println("猜对了");
                    break;
                }
                chances = chances - 1;
            }
            if (chances == 0) {
                System.out.println("机会用完了");
            }
            System.out.println("再玩一次吗？（0结束游戏，1继续玩）");
            again = input.nextInt();
        } while (again == 1);
    }
}