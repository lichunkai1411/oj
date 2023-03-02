package 面向对象.oop.String.method;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：10:30
 * @author lck
 */

/**
 * String类用于遍历的方法：
 *      public char [] toCharArray()将此字符串转换为一个新的字符数组
 *
 *      public char charAt(int index)返回指定索引处的char值
 *
 *      public int length()返回此i字符串的长度
 * @author lck
 */
public class StringMethodDemo2 {
    public static void main(String[] args) {
        print2();
    }
    /**
     *字符串遍历方式2
     */

    private static void print2() {
        String s = "itheima";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    /**
     * 字符串遍历方式1
     */
    private static void print1() {
        String s = "itheima";
        char[]chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
