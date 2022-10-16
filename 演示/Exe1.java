import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        System.out.println("你好");
        Scanner input = new Scanner(System.in);
        int prise;
        int amount;
        System.out.print("请输入票面:");
        amount = input.nextInt();
        System.out.print("请输入金额:");
        prise = input.nextInt();
        System.out.println(amount +"-"+ prise + "=" + (amount - prise));
    }
}
