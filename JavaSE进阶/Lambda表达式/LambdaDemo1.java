package Lambda表达式;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:31
 *
 * @author lck
 */

/**
 *          Lambda表达式：JDK8开始后的一种新语法形式
 *
 *              作用：简化匿名内部类的代码写法
 *              格式：() -> {}
 *                  ():匿名内部类被重写方法的形参列表
 *                  {}:被重写方法的方法体代码
 *  @author
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类，重写后的show方法...");
            }
        });

        useInterA(() -> {
            System.out.println("Lambda表达式，重写后的show方法...");
        });
    }

    public static void useInterA(InterA interA) {
        interA.show();
    }
}

interface InterA {
    void show();
}
