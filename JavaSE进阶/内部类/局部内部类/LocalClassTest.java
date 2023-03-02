package 内部类.局部内部类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：15:50
 *
 * @author lck
 */

/**
 * 局部内部类：放在方法、代码块、构造器等执行体中
 *
 * @author lck
 */
public class LocalClassTest {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

class A {
    public void show() {
        class B {
            public void method() {
                System.out.println("method...");
            }
        }
        B b = new B();
        b.method();
    }
}