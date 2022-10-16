import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请投币：");
        int amount = input.nextInt();
        if (amount>=10){
            System.out.println("**************");
            System.out.println("*JAVA城际铁路专线*");
            System.out.println("*  票价：10元   *");
            System.out.println("**************");
            System.out.println("找零：" + (amount - 10));
        }else {
            System.out.println("金额不足！");
            System.out.println("还需要"+(10-amount)+"元！");
        }
    }
}
