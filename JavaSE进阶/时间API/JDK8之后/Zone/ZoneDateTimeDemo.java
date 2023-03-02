package 时间API.JDK8之后.Zone;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：18:12
 */


import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * ZoneDateTime 带时区的时间对象:
 * static ZoneDateTime now():获取当前时间的ZoneDateTime对象
 * static ZoneDateTime ofXxxx(...):获取指定时间的ZoneDateTime对象
 * ZoneDateTime withXxx(时间):修改时间系统的方法
 * ZoneDateTime minusXxx(时间):减少时间系统的方法
 * ZoneDateTime plusXxx(时间):增加时间系统的方法
 */
public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        // 获取当前的ZoneDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println("-----------------------------");

        // 获取指定时间的ZoneDateTime对象
        ZonedDateTime of = ZonedDateTime.of(2008,8,8,8,8,8,8, ZoneId.systemDefault());
        System.out.println(of);
        System.out.println("-----------------------------");

        // 修改时间系统的方法
        System.out.println(now.withYear(2008));
        System.out.println(now.withMonth(8));
        System.out.println(now.withDayOfMonth(8));
        System.out.println("-----------------------------");

        // 减少时间系统的方法
        System.out.println(now.minusYears(1));
        System.out.println(now.minusMonths(1));
        System.out.println(now.minusDays(1));
        System.out.println("-----------------------------");

        // 增加时间系统的方法
        System.out.println(now.plusYears(1));
        System.out.println(now.plusMonths(1));
        System.out.println(now.plusDays(1));
        System.out.println("-----------------------------");
    }
}
