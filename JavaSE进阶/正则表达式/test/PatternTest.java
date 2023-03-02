package 正则表达式.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：09:37
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 需求：请把下面文本中的电话，邮箱，座机号码，热线都爬取出来
 */
public class PatternTest {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java," +
                "电话:18666668888,18699997777或者联系" +
                "邮箱:boniu@itcast.cn 邮箱:bozai@itcast.cn 邮箱2:dlei0009@163.com" +
                "座机电话:01036517895, 010-98951256 " +
                "热线电话:400-618-9090 , 400-618-4000 , 40061840000 , 4006189090";
        // 定义爬取正则
        String regex = "[1][3-9]\\d{9}|\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+|[0]\\d{2,3}-?\\d{7,8}|400-?\\d{3}-?\\d{4}";
        // 1.将正则表达式封装为Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 2.获取匹配器对象
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
