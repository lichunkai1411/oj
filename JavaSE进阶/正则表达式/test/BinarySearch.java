package 正则表达式.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-18
 * Time：18:02
 */

/**
 * 1.QQ号正则表达式
 * 不能以0开头
 * 全部为数字
 * 5~12位
 *
 * 2.手机号正则表达式
 * 必须是1开头
 * 第二位:3 4 5 6 7 8 9
 * 全部都是数字,必须为11位
 *
 * 3.邮箱正则表达式
 * zhangSan@itcast.cn
 * zhangsan@163.com
 * 123456@qq.com
 * zhangsan@sina.com
 * zhangsan@itcast.qq.com
 * zhangsan@xxx.edu
 * zhangsan@xxx.org
 */
public class BinarySearch {
    public static void main(String[] args) {
        String emailRegex = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhangSan@itcast.cn".matches(emailRegex));
        System.out.println("zhangsan@163.com".matches(emailRegex));
        System.out.println("123456@qq.com".matches(emailRegex));
        System.out.println("zhangsan@sina.com".matches(emailRegex));
        System.out.println("zhangsan@itcast.qq.com".matches(emailRegex));
        System.out.println("zhangsan@xxx.edu".matches(emailRegex));
        System.out.println("zhangsan@xxx.org".matches(emailRegex));
    }

    private static void phoneNumMethod() {
        String phoneNumRegex = "[1][3-9]\\d{9}";
        System.out.println("15940115850".matches(phoneNumRegex));
    }

    private static void qqMethod() {
        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("123456".matches(qqRegex));
    }
}
