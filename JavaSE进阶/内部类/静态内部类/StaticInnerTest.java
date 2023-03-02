package 内部类.静态内部类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：14:14
 * @author lck
 */

/**
 *      静态内部类：static修饰的成员内部类
 *
 *      创建对象格式：外部类名.内部类名 对象名 = new 外部类名.内部类对象();
 *
 *      注意事项：静态只能访问静态
 */
public class StaticInnerTest {
    public static void main(String[] args) {
        OuterClass.InnerClass oi = new OuterClass.InnerClass();
//        oi.show();
        OuterClass.InnerClass.show();
    }
}
class OuterClass{
    int num1 =10;
    static int num2 = 20;
    static class InnerClass{
        // 当方法内修饰为静态方法时可以通过.调用到方法不需要创建对象
        public static void show(){
            System.out.println("show...");
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.num1);
            System.out.println(num2);
        }
    }
}