package 面向对象.oop.String.method;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-01
 * Time：11:07
 * @author lck
 */

/**
 * String类的截取方法：
 *              public String substring(int beginIndex):根据传入的索引开始做截取，截取到字符串的末尾
 *              public String substring(int beginIndex,int endIndex):根据传入的开始和结束索引，对字符串截取(包含头，不包含尾)
 *              注意：截取出来的内容，是作为新的字符串返回，别忘记找变量接收
 * @author lck
 */
public class StringMethodDemo3 {
    public static void main(String[] args) {
        method2();
        method();
    }

    private static void method2() {
        String s = "itheima";
        String substring = s.substring(0, 2);
        System.out.println(substring);
    }

    private static void method() {
        String s = "itheima";
        String substring = s.substring(2);
        System.out.println(substring);
    }
}
