package 面向对象.oop.String.StringBuider;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：13:30
 * @author lck
 */
public class StringBuilderDemo2 {
    /**
     * StringBuilder的介绍：
     *      1.一个可变的字符序列
     *      2.StringBuilder是字符串的缓冲区，将其理解是容器，这个容器可以存储任意数据类型，但是只要进入到这个容器全部变成字符串.
     *
     * StringBuilder的构造方法：
     *      public StringBuilder() : 创建一个空白的字符串缓冲区(容器)，其初始容量为16个字符，自动扩容
     *      public StringBuilder(int capacity(指定初始容量)）创建一个不带任何字符的字符串生成器，其初始容量由capacity参数指定
     *      public StringBuilder(String str) : 创建一个字符串缓冲区(容器),容器创建好之后，就会带有参数的内容
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();


    }

    private static void method2(StringBuilder stringBuilder) {
        System.out.println(stringBuilder);

        stringBuilder.append("红色");
        System.out.println(stringBuilder);

        stringBuilder.append("绿色");
        System.out.println(stringBuilder);

        stringBuilder.append("蓝色");
        System.out.println(stringBuilder);
    }

    private static void method1(StringBuilder stringBuilder) {
        stringBuilder.append(100);
        stringBuilder.append(45.6);
        stringBuilder.append(false);
        stringBuilder.append('中');
        stringBuilder.append("黑马程序员");

        System.out.println(stringBuilder);
    }
}
