package 面向对象.oop.String.StringBuider;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：13:08
 * @author lck
 */
public class StringBuilderDemo1 {
    /**
     * StringBuilder的作用：提高代码的操作效率
     *      1.StringBuilder的特点
     *      2.StringBuilder的构造方法
     *      3.StringBuilder常用成员方法
     *      4.练习
     *      5.StringBuilder如何提高效率的
     */


    public static void main(String[] args) {

    }

    private static void method2() {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void method() {
        // 获取1070年1月1日0时0分0秒到现在所经历过的毫秒值
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 100000; i++) {
            s+=i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
