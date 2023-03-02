package 多态.案例;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：22:58
 * @author lck
 */
public class CreditCardPaymentImpl implements Payment{

    @Override
    public void pay(double money) {
        System.out.println("通过信用卡快捷支付："+money+"元！");
    }
}
