package 时间API.JDK8之后.interVal;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：18:28
 */

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Duration稷山日期间隔(时分秒)
 */
public class DurationDemo {
    public static void main(String[] args) {
        // 此刻日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 昨天的日期时间对象
        LocalDateTime otherDate = LocalDateTime.of(2023,2,4,0,0,0);
        System.out.println(otherDate);

        Duration duration = Duration.between(otherDate,today);// 第二个参数减第一个参数

        System.out.println(duration.toDays());// 两个时间差的天数
        System.out.println(duration.toHours());// 两个时间差的小时数
        System.out.println(duration.toMinutes());// 两个时间差的分钟数
        System.out.println(duration.toMillis());// 两个时间差的毫秒数
        System.out.println(duration.toNanos());// 两个时间差的纳秒数
    }
}
