package 接口;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-12
 * Time：11:25
 * @author lck
 */

import 包.a.Inter;

/**
 *          接口中的成员特点：
 *              1.成员变量:只能定义常量，因为系统会默认加入三个关键字
 *                                  public static final
 *                                  - 这三个关键字没有顺序关系
 *
 *              2.成员方法:只能是抽象方法，因为系统会默认加入两个关键字
 *                                  public abstract
 *
 *              3.构造方法:没有
 * @author lck
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        System.out.println(MyInter.NUM);
        System.out.println(Inter.NUM);
    }
}
interface MyInter {
    int NUM = 10;
    public void show();
    void method();
}