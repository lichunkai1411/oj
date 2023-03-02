package API.包装类.Integer;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-17
 * Time：10:29
 */

/**
 * 包装类:将基本数据类型,包装成类,变成引用数据类型
 * ---------------------------------------------------------------
 * 手动装箱:调用方法,手动将基本数据类型,包装成类
 * 1.public Integer(int value):通过构造方法(过时了不推荐使用)
 * 2.public static Integer valueOf(int i):通过静态方法
 * 手动拆箱:调用方法,手动将包装类,拆成(转换)基本数据类型
 * 1.public int intValue():以int类型返回该Integer的值
 * ---------------------------------------------------------------
 * JDK5版本开始,出现了自动拆装箱:
 * 1.自动装箱:可以将基本数据类型,直接赋值给包装类的变量
 * 2.自动拆箱:可以将包装类的数据,直接赋值给基本数据类型变量
 *
 * 结论:基本数据类型,和对用的包装类,可以直接做运算了,不需要操心转换的问题了
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 10;
        // 自动装箱
        Integer integer = num;
        System.out.println(integer);
        Integer integer1 = num;
        System.out.println(integer1);
    }

    private static void handMovement() {
        int num = 10;
        // 过时不推荐使用
        // Integer integer1 = new  Integer(num);
        // 手动装箱
        Integer integer = Integer.valueOf(num);
        System.out.println(integer);
        // 手动拆箱
        int i = integer.intValue();
        System.out.println(i);
    }
}
