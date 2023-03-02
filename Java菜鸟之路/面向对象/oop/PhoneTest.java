package 面向对象.oop;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：10:11
 * @author lck
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone();

        phone.brand="小米";
        phone.color="白色";
        phone.price=4999;

        phone1.brand="华为";
        phone1.color="黑色";
        phone1.price=6999;

        System.out.print(phone.brand+"\t");
        System.out.print(phone.color+"\t");
        System.out.print(phone.price);
        System.out.println();
        System.out.print(phone1.brand+"\t");
        System.out.print(phone1.color+"\t");
        System.out.println(phone1.price);

        phone.call("dda");
        phone.sendMessage();

        phone1.call("dde");
        phone1.sendMessage();
    }
}
