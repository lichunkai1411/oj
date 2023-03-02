package 时间API.JDK8之前.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：10:15
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat类:用于日期格式化
 *
 * 1.构造方法:
 * public SimpleDateFormat():创建日期格式化对象,使用[默认模式]
 * public SimpleDateFormat(String pattern):创建一个日期格式化对象,[手动指定模式]
 * 2.常用方法:
 * public final String format(Date date):将日期对象,转换为字符串
 * public final Date parse(String source):将日期字符串,解析为日期对象
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws Exception {
        String s = "2023年2月19日 12:20";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 KK:mm");
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
    }

    private static void 手动模式() {
        // 创建一个日期格式化对象,[手动指定模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");
        // 创建Date对象,封装此刻的时间
        Date date = new Date();
        // 将日期对象,转换为字符串
        System.out.println(simpleDateFormat.format(date));
    }

    private static void 默认模式() {
        // 创建一个日期格式化对象,使用[默认模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        // 创建Date对象,封装此刻的时间
        Date date = new Date();
        // 将日期对象,转换为字符串
        System.out.println(simpleDateFormat.format(date));
    }
}
