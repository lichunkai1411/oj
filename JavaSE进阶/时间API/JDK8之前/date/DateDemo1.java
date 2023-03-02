package 时间API.JDK8之前.date;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：10:00
 */

import java.util.Date;

/**
 * Date类:表示时间
 * 1.构造方法:
 * public Date():将当前时间,封装为Date日期对象
 * public Date(long time):把时间毫秒值转换成Date日期对象
 * 2.常见方法:
 * public long getTime():返回从1970年1月1日 00:00:00走到此刻的毫秒数
 * public void setTime(long time):设置日期对象的时间为当前时间毫秒值对应的时间
 */
public class DateDemo1 {
    public static void main(String[] args) {
        // 将当前时间,封装为Date日期对象
        Date date = new Date();
        System.out.println(date);

        // 把时间毫秒值转换成Date日期对象
        Date date1 = new Date(1000L);
        System.out.println(date1);

        System.out.println(date.getTime());
        System.out.println(date1.getTime());
        System.out.println("-----------------------");
        Date date2 = new Date();
        date2.setTime(0L);
        System.out.println(date2);
    }
}
