package static关键字;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-08
 * Time：18:14
 * @author lck
 */
public class StaticDemo2 {
    static int num1=10;
    int num2 = 20;

    public static void method(){
        System.out.println("static...method");
    }
    public void print(){
        System.out.println("print...");
    }
    public static void main(String[] args) {
        // static方法中，只能访问静态成员(直接访问)
        System.out.println(num1);
        method();
    }
}
