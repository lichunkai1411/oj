package 时间API.JDK8之后;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：16:36
 */

import java.time.LocalDateTime;

/**
 * LocalDate,LocalTime,LocalDateTime
 * 对象的创建方式:
 * 1.now():当前时间
 * 2.of(...):设置时间
 * ------------------------------------
 * LocalDateTime转换LocalDate,LocalTime
 * 1.toLocalDate()
 * 2.toLocalTime()
 */
public class Demo {
    public static void main(String[] args) {
        // 获取此刻的时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear()+"年");
        System.out.println(now.getMonthValue()+"月");
        System.out.println(now.getDayOfMonth()+"日");
        System.out.println(now.getHour()+"时");
        System.out.println(now.getMinute()+"分");
        System.out.println(now.getSecond()+"秒");
        System.out.println(now.getNano()+"纳秒");
        // 获取指定的时间对象
        LocalDateTime of = LocalDateTime.of(2008, 8, 8, 8, 8);
        System.out.println(of);
    }
}
