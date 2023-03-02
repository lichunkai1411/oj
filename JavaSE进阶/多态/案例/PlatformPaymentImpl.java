package 多态.案例;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：22:55
 * @author lck
 */
public class PlatformPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过支付平台支付了："+money+"元！");
    }
}
