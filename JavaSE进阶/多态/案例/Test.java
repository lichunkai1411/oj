package 多态.案例;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：22:50
 *
 * @author lck
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择支付方式：1.支付平台支付  2.银行卡网银支付  3.信用卡快捷支付");
        int choice = scanner.nextInt();

        Payment payment = null;

        switch (choice) {
            case 1:
                payment = new PlatformPaymentImpl();
                break;
            case 2:
                payment = new BankcardPaymentImpl();
                break;
            case 3:
                payment = new CreditCardPaymentImpl();
                break;
            default:
                System.out.println("您选择的字符方式有误!");
        }
        System.out.println("请输入您的支付金额：");
        double money = scanner.nextInt();
        payment.pay(money);
    }
}
