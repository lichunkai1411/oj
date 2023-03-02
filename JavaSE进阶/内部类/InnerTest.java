package 内部类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：13:47
 * @author lck
 */

/**
 *          内部类：在类中定义的类
 *
 *          创建对象格式：外部类名.内部类名 对象名 = new 外部类对象(). 内部类对象();
 *
 *          成员访问细节：
 *                  1.内部类中，访问外部类成员：直接访问，包括私有
 *                  2.外部类，访问内部类成员：需要创建对象访问
 * @author lck
 */
public class InnerTest {
    public static void main(String[] args) {
        OuterA.Inner oi = new OuterA().new Inner();
        System.out.println(oi.num);
        oi.show();
    }
}
class OuterA{
    private void method(){
        System.out.println("method...");
        Inner inner = new Inner();
        System.out.println(inner.num);
    }
    class Inner{
        int num = 10;
        public void show(){
            System.out.println("show...");
            method();
        }
    }
}
