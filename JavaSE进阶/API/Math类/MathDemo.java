package API.Math类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：23:20
 */

/**
 *      Math类：包含执行基本数字运算的方法
 *
 *      --------------------------------------------------
 *      public static int abs (int a) :获取参数绝对值
 *      public static double ceil (double a) :向上取整
 *      public static double floor (double a) : 向下取整
 *      public static int round (float a) :四舍五入
 *      public static int max (int a,int b) : 获取两个int值中的较大值
 *      public static double pow (double a,double b) :返回a的b次幂的值
 *      public static double random () :返回值为double的随机值，范围[0.0,1.0)
 *      --------------------------------------------------
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-123));     // 123
        System.out.println(Math.abs(-12.3));    // 12.3
        System.out.println("----------------");
        System.out.println(Math.ceil(12.0));    // 12.0
        System.out.println(Math.ceil(12.2));    // 13
        System.out.println(Math.ceil(12.5));    // 13
        System.out.println(Math.ceil(12.9));    // 13
        System.out.println("----------------");
        System.out.println(Math.floor(12.0));   // 12.0
        System.out.println(Math.floor(12.2));   // 12.0
        System.out.println(Math.floor(12.5));   // 12.0
        System.out.println(Math.floor(12.9));   // 12.0
        System.out.println("----------------");
        System.out.println(Math.round(3.4));    // 3
        System.out.println(Math.round(3.6));    // 4
        System.out.println("----------------");
        System.out.println(Math.max(10, 20));   // 20
        System.out.println(Math.min(10, 20));   // 10
        System.out.println("----------------");
        System.out.println(Math.pow(2, 3));    // 8
        System.out.println("----------------");
        System.out.println(Math.random());      // 获取一个随机数范围[0.0,1.0)永远不会达到1
    }
}
