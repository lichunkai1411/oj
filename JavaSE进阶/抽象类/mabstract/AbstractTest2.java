package 抽象类.mabstract;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：09:11
 * @author lck
 */

/**
 *      抽象类的注意事项：
 *
 *              1.抽象类不能实例化
 *                  - 如果抽象方法允许创建对象，就可以调用内部没有方法体的抽象方法了(没有意义)
 *              2.抽象类存在构造方法
 *                  - 交给子类通过super进行访问
 *              3.抽象类中介意存在普通方法
 *                  - 可以让子类继承到继续使用
 *              4.抽象类的子类
 *                   1).要么重写抽象类中的所有方法
 *                   2).要么是抽象类
 * @author lck
 */
public class AbstractTest2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
abstract class Fu{

    public Fu() {

    }
    public abstract void show();
    // 普通让子类继承使用
    public void method(){
        System.out.println("method...");
    }
}
class Zi extends Fu{
    public Zi() {
        super();
    }

    @Override
    public void show() {

    }
}
abstract class A{
    public abstract void showA();
}
abstract class B extends A{

    @Override
    public void showA() {

    }
    public abstract void showB();
}
class C extends B{

    @Override
    public void showB() {

    }
}