package 面向对象.oop.String.StringBuider;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：13:51
 * @author lck
 */
public class StringBuilderDemo3 {
    /**
     *  StringBuilder常用成员方法：
     *          1.public StringBuilder append(任意类型) ：添加数据，并返回对象自己
     *          2.public StringBuilder reverse() : 将缓冲区的内容，进行反转
     *          3.public int length() : 返回长度
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        method1(stringBuilder);
        method2(stringBuilder);
        method3(stringBuilder);
        method4(stringBuilder);
        method5(stringBuilder);
    }

    private static void method5(StringBuilder stringBuilder) {
        // 链式编程：调用的结果是对象，就可以继续向下调用方法
        stringBuilder.append("红色").append("绿色").append("蓝色");
        System.out.println(stringBuilder);
        // 情况：数据在StringBuilder当中，要调用的方法，StringBuilder没有，但是String有
        // 解决：转换为String，再调用
        String[] sArr = stringBuilder.toString().split("色");
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
    }

    private static void method4(StringBuilder stringBuilder) {
        // 链式编程：调用的结果是对象，就可以继续向下调用方法
        stringBuilder.append("红色").append("绿色").append("蓝色");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }

    /**
     * 将缓冲区的内容，进行反转
     * @param stringBuilder
     */
    private static void method3(StringBuilder stringBuilder) {
        // 链式编程：调用的结果是对象，就可以继续向下调用方法
        stringBuilder.append("红色").append("绿色").append("蓝色");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    /**
     * 链式编程：调用的结果是对象，就可以继续向下调用方法
     * @param stringBuilder
     */
    private static void method2(StringBuilder stringBuilder) {
    /*StringBuilder sb1 = stringBuilder.append("红色");
    sb1.append("绿色");*/
        // 链式编程：调用的结果是对象，就可以继续向下调用方法
        stringBuilder.append("红色").append("绿色");
        System.out.println(stringBuilder);
    }

    private static void method1(StringBuilder stringBuilder) {
        StringBuilder sb1 = stringBuilder.append("红色");
        StringBuilder sb2 = stringBuilder.append("绿色");
        StringBuilder sb3 = stringBuilder.append("蓝色");
        System.out.println(stringBuilder);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
