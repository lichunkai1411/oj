package 时间API.JDK8之后.LocalDate;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：16:57
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        // 1.获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期:"+nowDate);

        int year = nowDate.getYear();
        System.out.println("year:" + year);

        Month month = nowDate.getMonth();
        System.out.println("month:" + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day:" + day);

        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayOfYear);
        // 星期
        System.out.println("星期:"+nowDate.getDayOfWeek());
        System.out.println("星期:"+nowDate.getDayOfWeek().getValue());

        // 月份
        System.out.println("月份:" + nowDate.getMonth());
        System.out.println("月份:" + nowDate.getMonth().getValue());
    }
}
