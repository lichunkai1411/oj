package 时间API.JDK8之后.interVal;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：18:28
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * ChronoUnit可用于在单个时间单位内测量一段时间,这个工具类是最全的,可以用于比较所有的时间单位
 */
public class ChronoUnitDemo {
    public static void main(String[] args) {
        // 本地日期时间对象:此刻的
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 生日时间
        LocalDateTime birthday = LocalDateTime.of(2023,2,4,0,0,0);
        System.out.println(birthday);

        System.out.println("相差的年数:"+ ChronoUnit.YEARS.between(birthday,today));
        System.out.println("相差的月数:"+ ChronoUnit.MONTHS.between(birthday,today));
        System.out.println("相差的周数:"+ ChronoUnit.WEEKS.between(birthday,today));
        System.out.println("相差的天数:"+ ChronoUnit.DAYS.between(birthday,today));
        System.out.println("相差的时数:"+ ChronoUnit.HOURS.between(birthday,today));
        System.out.println("相差的分数:"+ ChronoUnit.MINUTES.between(birthday,today));
        System.out.println("相差的秒数:"+ ChronoUnit.SECONDS.between(birthday,today));
        System.out.println("相差的毫秒数:"+ ChronoUnit.MILLIS.between(birthday,today));
        System.out.println("相差的微秒数:"+ ChronoUnit.MICROS.between(birthday,today));
        System.out.println("相差的纳秒数:"+ ChronoUnit.NANOS.between(birthday,today));
        System.out.println("相差的纪元数:"+ ChronoUnit.ERAS.between(birthday,today));
    }
}
