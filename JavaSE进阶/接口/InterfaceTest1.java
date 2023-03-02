package 接口;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：09:33
 * @author lck
 */

/**
 *          接口：体现的思想就是声明[规则]
 *
 *          思路：如果发现一个类，所有的组成，都是抽象方法
 *                  - 没有成员变量
 *                  - 没有普通方法
 *
 *                  这种类，我们通常会设计为java中的接口，因为现在这个类存在的唯一价值，就只是声明规则了
 *           ---------------------------------------------------------------------------------
 *
 *           接口定义格式：
 *                      interface接口名 {}
 *
 *           注意：接口不能实例化
 *
 *           接口和类之间是实现关系，通过implements关键字完成
 *
 *           实现接口格式：
 *                  class 类名 implements 接口名 {}
 *
 *                  实现类(接口的子类):
 *                          1.重写所有抽象方法
 *                          2.将实现类变成抽象类
 * @author lck
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        // 创建实现类对象
        InterImpl inter = new InterImpl();
        inter.method();
        inter.show();
    }
}
interface Inter{
    public abstract void show();
    public abstract void method();
}
    // 重写所有抽象方法
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void method() {
        System.out.println("method...");
    }
}
    // 将实现类变成抽象类
abstract class InterImpl2 implements Inter{

}
class Zi extends InterImpl2{

    @Override
    public void show() {

    }

    @Override
    public void method() {

    }
}