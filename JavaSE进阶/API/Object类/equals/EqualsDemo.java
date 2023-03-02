package API.Object类.equals;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：17:48
 */

import API.Object类.toString.Student;

import java.util.Objects;

/**
 * Object类中的equals方法：
 * public boolean equals(Object obj)
 * 对象之间进行比较，返回true，或者是false
 * <p>
 * public boolean equals(Object obj){
 * // this : stu1
 * // obj : stu2
 * return (this == obj);
 * }
 * 结论：Object类中对的equals方法，默认比较的是对象内存地址
 * - 通常会重写equals方法，让对象之间，比较内容
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 23);
        Student student2 = new Student("张三", 23);
        System.out.println(Objects.isNull(student1));
        System.out.println(Objects.isNull(student2));
        System.out.println(student1.equals(student2));
        // 问题：Objects.equals方法 和 stu1.equals方法，有什么区别？
        // 细节：Objects.equals方法，内部依赖于我们自己所写的equals
        // 好处：Objects.equals方法，内部带有非null判断
        /**
         * public static boolean equals(Object a, Object b) {
         * -------------------------------------------------------------------------------------
         * a == b ：如果地址相同，就会返回为true，这里使用的是短路||，左边为true右边就不执行了
         *      - 结论：如果地址相同，方法直接返回为true
         *    ：如果地址不相同，就会返回false，短路||，左边为false，右边要继续执行.
         * -------------------------------------------------------------------------------------
         *    a != null : 加入a是null值
         *                  null != null : false
         *                  && : 左边为false，右边就不执行了，记录着null值的a，就不会调用equals方法
         *                          - 避免空指针异常！
         * -------------------------------------------------------------------------------------
         *     a != null : 假设a不是null值
         *          stu1 = null : true
         *          && ： 左边为true，右边继续执行，a.equals(b)，这里就不会出现空指针异常
         * return (a == b) || (a != null && a.equals(b));
         * }
         */
        System.out.println(Objects.equals(student1, student2));
    }
}
