package 继承;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-09
 * Time：13:04
 *
 * @author lck
 */

/**
 *      java只支持单继承，不支持多继承，但支持多层继承
 * @author lck
 */
public class ExtendsDemo4 {
    public static void main(String[] args) {
    C c = new C();
    c.methodA();
    c.methodB();
    c.methodC();
    }
}

class A {
    public void methodA() {
        System.out.println("A...");
    }
}

class B extends A{
    public void methodB() {
        System.out.println("B...");
    }
}

class C extends B{
    public void methodC() {
        System.out.println("C...");
    }
}
