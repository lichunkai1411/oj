package API.Object类.toString;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：15:21
 */

import java.util.ArrayList;

/**
 * public String toString()
 * 返回对象的字符串表示形式。
 * public String toString() {
 * return getClass().getName + "@" + Integer.toHexString(hashCode());
 * }
 * getClass().getName:类名称，全类名(包名 + 类名)
 * @:表示分隔符
 * Integer.toHexString():转十六进制
 * hashCode()：返回的是对象内存地址 + 哈希算法，算出来的整数(哈希值)
 *
 * 如果打印对象名，输出的不是地址，就说明这个方法一定重写过toString方法
 * ------------------------
 * 细节：使用打印语句，打印对象名的时候，print方法，源码层面，会自动调用该对象的toString方法
 */
public class ToStringDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
        Student student = new Student("张三",23);
        System.out.println(student);
// 如果打印对象名，输出的不是地址，就说明这个方法一定重写过toString方法
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        System.out.println(list);
    }
}

class A {
    @Override
    public String toString() {
        return "大哥重写了toString方法";
    }
}