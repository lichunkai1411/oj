package API.BigDecimal类;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-16
 * Time：23:59
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal类:解决小数运算中，出现的不精确问题
 *
 * BigDecimal创建对象：
 *      public BigDecimal (double val) : 不推荐使用不能解决不精确的问题
 *      public BigDecimal (String val) :
 *      public static BigDecimal valueOf (double val)
 *      -------------------------------------------------------------
 *      BigDecimal常用的成员方法：
 *      public BigDecimal add(BigDecimal b) : 加法
 *      public BigDecimal subtract(BigDecimal b) : 减法
 *      public BigDecimal multiply(BigDecimal b) : 乘法
 *      public BigDecimal divide(BigDecimal b) : 除法
 *      public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式) : 除法
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2,2, RoundingMode.UP));
        System.out.println(bd1.divide(bd2,2, RoundingMode.DOWN));
        BigDecimal result = bd1.divide(bd2,2,RoundingMode.HALF_UP);
        double v = result.doubleValue();
        System.out.println(v);
    }

    private static void method() {
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(0.2);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
    }

    private static void EncapsulateAsString() {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd1.add(bd2));
    }

    private static void problem() {
        double num1 = 0.1;
        double num2 = 0.2;
        System.out.println(num1+num2);
    }
}
