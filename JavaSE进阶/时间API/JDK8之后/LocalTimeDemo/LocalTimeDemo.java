package 时间API.JDK8之后.LocalTimeDemo;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：16:53
 */
public class LocalTimeDemo {
    public static void main(String[] args) {
        // 1.获取本地时间对象
        LocalDateTime nowTime = LocalDateTime.now();
        //今天的时间
        System.out.println("今天的时间:"+nowTime);
        // 时
        int hour = nowTime.getHour();
        System.out.println(hour);
        // 分
        int minute = nowTime.getMinute();
        System.out.println(minute);
        // 秒
        int second = nowTime.getSecond();
        System.out.println(second);
        // 纳秒
        int nano = nowTime.getNano();
        System.out.println(nano);
    }
}
