package 面向对象.oop.String.method;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-31
 * Time：14:12
 * @author lck
 */
public class StringMethodDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("-----------------------------------");
        String ss1 = "Abc";
        String ss2 = "abc";
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1.equalsIgnoreCase(ss2));
    }
}
