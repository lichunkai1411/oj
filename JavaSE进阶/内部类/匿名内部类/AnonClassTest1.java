package 内部类.匿名内部类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-13
 * Time：16:00
 * @author lck
 */

/**
 *      匿名内部类：
 *              概述：匿名内部类本质上是一个特殊的局部内部类(定义在方法内部)
 *              前提：需要存在一个接口或类
 *              格式：
 *                  new 类名、接口名 () {
 *
 *                  }
 *                  new 类名() {}:代表继承这个类
 *                  new 接口名() {}：代表实现这个接口
 *
 *              结论：可以让代码变得更加简洁，在定义类的时候对其进行实例化
 *              思路：将来在调用别人写好的方法，方法的参数要的是接口，首先得给实现类对象(要么单独写一个实现类然后new对象传入要么给一个匿名内部类)看方法多不多选择使用哪种方式
 * @author lck
 */
public class AnonClassTest1 {
    public static void main(String[] args) {
        // 问题：方法的形参是接口类型，我们该传入的是什么？
        // 答案：传入的是该接口的实现类对象
        useInter(new InterImpl());

        // 匿名内部类方式
        useInter(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类...show...");
            }
        });
    }
    public static void useInter(InterA inter){  // Inter inter = new InterImpl();
        inter.show();
    }
}
interface InterA{
    void show();
}
class InterImpl implements InterA{

    @Override
    public void show() {
        System.out.println("InterImpl...show...");
    }
}