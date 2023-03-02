package 面向对象.oop.list;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-04
 * Time：11:24
 * @author lck
 */

import java.util.ArrayList;

/**
 * ArrayList集合的使用：
 *              细节：创建String，StringBuilder，ArrayList类的对象，打印对象名，都没有看到地址值，而是元素内容
 *              1.构造方法
 *                  public ArrayList():创建一个空的集合数组
 *              2.集合容器的创建细节：
 *                  ArrayList list = new ArrayList();
 *                  现象：可以添加任意类型数据
 *                  弊端：数据不够严谨
 *                  <> : 泛型
 *                          目前：使用泛型，可以对集合中存储的数据，进行类型限制
 *                          细节：泛型中，不允许编写数据类型
 *                          问题：要是想在集合中存储，整数，小数，字符....这些数据，怎么办？
 *                          解决：使用基本类型，所对应的包装类
 *
 * @author lck
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        method4();
        method3();

//        System.out.println(list);
    }

    private static void method4() {
        ArrayList<String>list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        System.out.println(list2);
    }

    private static void method3() {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);
        System.out.println(list1);
    }

    private static void method2(ArrayList<Integer> list) {
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
    }

    private static void method1(ArrayList list) {
        list.add("张三");
        list.add("李四");
        list.add("王五");
    }
}
