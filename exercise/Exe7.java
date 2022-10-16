import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        while (true) {
            System.out.println("请投币：");
            int amount = input.nextInt();
            balance = balance + amount;
            if (balance >= 10) {
                System.out.println("***************");
                System.out.println("*   JAVA城际铁路专线   *");
                System.out.println("*   票价：十元   *");
                System.out.println("***************");
                System.out.println("找零" + (balance - 10));
                balance = 0;
            } else {
                System.out.println("金额不足");
                System.out.println("购票失败");
                System.out.println("还需要：" + (10 - amount) + "元");
            }
        }
    }
}
