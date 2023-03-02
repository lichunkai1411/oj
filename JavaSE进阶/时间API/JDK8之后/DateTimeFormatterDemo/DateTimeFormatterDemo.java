package 时间API.JDK8之后.DateTimeFormatterDemo;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：17:31
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 用于时间的格式化和解析:
 * 1.对象的获取:
 * static DateTimeFormatter ofPattern(格式):获取格式对象
 * 2.格式化:
 * String Format(时间对象):按照指定方式格式化
 * 3.解析:
 * LocalDateTime.parse("解析字符串",格式化对象);
 * LocalDate.parse("解析字符串",格式化对象);
 * LocalTime.parse("解析字符串",格式化对象);
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("格式化之前:"+now);

        // 获取格式化对象
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");
        // 格式化
        String format = formatter.format(now);
        System.out.println("格式化之后:"+format);
        // 解析
        String time = "2008年08月08日";
        LocalDate parse = LocalDate.parse(time, formatter);
        System.out.println(parse);
    }
}
