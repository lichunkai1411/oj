package 新特性.JDK8;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：11:12
 * @author lck
 */

/**
 *          JDK8版本接口特性：
 *              1.允许定义非抽象方法，需要加入default关键字
 *                          - 作用：解决接口的升级问题
 *                          - 注意事项：
 *                                  1.public可以省略，但是default不能省略
 *                                  2.默认方法，实现类是允许重写的，但是需要去掉default关键字
 *                                  3.如果实现了多个接口，多个接口中存在相同的默认方法，实现类必须重写默认方法
 *              2.允许定义静态方法
 *
 *                          - 理解：既然接口已经允许方法带有方法体了，干脆也放开静态方法，可以类名调用
 *
 *                          - 注意事项：
 *                                  1.public可以省略，但是static不能省略
 *                                  2.接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
 * @author lck
 */
public class InterfaceTest {
    public static void main(String[] args) {
        AInterImpl aInter = new AInterImpl();
        aInter.method();
        // 接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
        A.function();
    }
}
interface A{
    default void method(){
        System.out.println("A...method");
    }
    public static void function(){
        System.out.println("A...static...function");
    }
}
interface Inter{
    void show();
    void print();

    // 提供默认方法
    public default void method(){
        System.out.println("Inter...method");
    }
}
class AInterImpl implements Inter,A{

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }

    @Override
    public void method() {
        Inter.super.method();
        A.super.method();
    }
}
class BInterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("BInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("BInterImpl...print");
    }
}
