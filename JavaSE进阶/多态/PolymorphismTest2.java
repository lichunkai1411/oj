package 多态;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：17:34
 * @author lck
 */

/**
 *          多态的成员访问特点：
 *              1.成员变量：编译看左边(父类),运行看左边(父类)
 *
 *              2.成员方法：编译看左边(父类),运行看右边(子类)
 *                                 在编译的时候，会检查父类中有没有这个方法
 *                                          没有：编译出错
 *                                          有：编译通过，但是运行的时候，一定执行子类的方法逻辑
 *                                     原因：担心你调用的方法，在父类中是一个抽象方法(抽象方法中没有逻辑没有意义)
 *
 *      ------------------------------------------------------------------------------------------------
 *               多态创建对象，调用静态成员：
 *                      静态的成员，推荐类名进行调用
 *                      细节：静态的成员，可以使用对象名调用，但这是一种假象
 *                              - 生成字节码文件后，会自动将对象名调用，改成类名调用
 * @author lck
 */
public class PolymorphismTest2 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.show();
        fu.print();
        System.out.println("--------------------------------");
        Inter inter = new InterImpl();
        inter.method();
    }
}
interface Inter{
    void method();
}
class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("method...");
    }
}
class Fu{
    int num =10;
    public void show(){
        System.out.println("Fu...show");
    }
    public static void print(){
        System.out.println("Fu...print");
    }
}
class Zi extends Fu{
    int num =20;

    @Override
    public void show() {
        System.out.println("Zi...show");
    }
    public static void print(){
        System.out.println("Zi...print");
    }
}