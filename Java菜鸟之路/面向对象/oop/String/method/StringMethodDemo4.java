package 面向对象.oop.String.method;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：11:34
 * @author lck
 */

/**
 * String类的替换方式：
 *          public String replace(CharSequence target, CharSequence replacement)：通过用 newChar 字符替换字符串中出现的所有 searchChar 字符，并返回替换后的新字符串
 *                          参数1：旧值
 *                          参数2：新值
 * @author lck
 */
public class StringMethodDemo4 {
    public static void main(String[] args) {
        String s = "itheima";
        String result = s.replace("heima", "baima");
        System.out.println(result);
    }
}
