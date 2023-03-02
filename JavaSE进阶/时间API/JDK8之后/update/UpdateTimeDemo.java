package 时间API.JDK8之后.update;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：17:06
 */
public class UpdateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        // 当前时间
        System.out.println(nowTime);
        // minus:减去
        // minusYears(年),minusMonth(月),minusDays(日),minusWeeks(周),minusHours(时),minusMinutes(分),minusSeconds(秒),minusNanos(纳秒)
        System.out.println("减一小时:"+nowTime.minusHours(1));
        System.out.println("减一分钟:"+nowTime.minusMinutes(1));
        System.out.println("减一秒钟:"+nowTime.minusSeconds(1));
        System.out.println("减一纳秒:"+nowTime.minusNanos(1));
        System.out.println("对比时间,确定方法返回的都是新的实例 >>>>>>>"+nowTime);

        System.out.println("----------------------------");

        // plus:加
        // plusYears(年),plusMonth(月),plusDays(日),plusWeeks(周),plusHours(时),plusMinutes(分),plusSeconds(秒),plusNanos(纳秒)
        System.out.println("加一小时:"+nowTime.plusHours(1));
        System.out.println("加一分钟:"+nowTime.plusMinutes(1));
        System.out.println("加一秒钟:"+nowTime.plusSeconds(1));
        System.out.println("加一纳秒:"+nowTime.plusNanos(1));
        System.out.println("-----------------------------");

        // with:这里体现出的是,设置效果
        System.out.println("修改的效果:");
        // withYears(年),withMonth(月),withDays(日),withWeeks(周),withHours(时),withMinutes(分),withSeconds(秒),withNanos(纳秒)
        System.out.println(nowTime.withYear(2008));
        System.out.println(nowTime.withMonth(8));
        System.out.println(nowTime.withDayOfMonth(8));
        System.out.println(nowTime.withHour(8));
        System.out.println(nowTime.withMonth(8));
        System.out.println(nowTime.withSecond(8));
        System.out.println(nowTime.withNano(8));
        System.out.println("------------------------------");

        LocalDate myDate = LocalDate.of(2008,8,8);
        LocalDate nowDate = LocalDate.now();

        // 2008-08-08是否在nowDate之前?
        System.out.println(myDate+"是否在"+nowDate+"之前?"+myDate.isBefore(nowDate));

        // 2008-08-08是否在nowDate之hou ?
        System.out.println(myDate+"是否在"+nowDate+"之后?"+myDate.isAfter(nowDate));
        System.out.println("------------------------------");

        // 判断两个事件是否相同
        System.out.println(myDate.equals(nowDate));
    }
}
