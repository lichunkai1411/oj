import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您猜拳：1，剪刀2，石头3，布");
        int wj = sc.nextInt();
        Random ra = new Random();
        int dn = ra.nextInt(3)+1;
        int count = wj-dn;
        switch (count) {
            case 1, -2 -> {
                System.out.println("电脑：" + dn);
                System.out.println("结果为：" + count);
                System.out.println("您赢了！");
            }
            case -1, 2 -> {
                System.out.println("电脑：" + dn);
                System.out.println("结果为：" + count);
                System.out.println("您输了！");
            }
            case 0 -> {
                System.out.println("电脑：" + dn);
                System.out.println("结果为：" + count);
                System.out.println("平局！");
            }
        }
    }
}