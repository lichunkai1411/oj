package 面向对象.oop.myThis;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-30
 * Time：11:16
 * @author lck
 */
public class ThisTest {
    /**
     * 情况：成员变量和局部变量重名的情况，Java使用的是就近原则
     *
     * 问题：非要使用成员变量怎么办？
     * 解决：使用this关键字进行区分
     *
     *      this可以区分局部变量和成员变量的重名问题
     *
     *      this关键字的作用：
     *            this可以调用本类成员(变量，方法)
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        thisDemo.name="钢门吹雪";
        thisDemo.sayHello("西域狂鸭");
    }
}
