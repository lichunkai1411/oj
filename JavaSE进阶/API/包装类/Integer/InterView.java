package API.包装类.Integer;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-17
 * Time：10:29
 */

/**
 * Integer 常用方法:
 * public static String toBinaryString (int i)  :转二进制
 * public static String toOctalString (int i)   :转八进制
 * public static String toHexString (int i)     :转十六进制
 * public static int parseInt (String s)        :将数字字符串,转换为数字
 */
public class InterView {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(Integer.toBinaryString(num));// 转二进制
        System.out.println(Integer.toOctalString(num));// 转八进制
        System.out.println(Integer.toHexString(num));// 转十六进制


        String s = "123";
        System.out.println(Integer.parseInt(s)+100);// 223
    }
}
