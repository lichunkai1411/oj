package 时间API.JDK8之前.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：10:34
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 需求:计算你来到这个世界多少天
 * <p>
 * 分析:
 * 1.键盘录入用户的生日(日期字符串)
 * 2.创建SimpleDateFormat对象,指定模式,用于将日期字符串解析为Date日期对象(birthdayDate)
 * 3.创建Date日期对象,封装此刻的时间(todayDate)
 * 4.long time = today.getTime() - birthdayDate.getTime();
 * 5.将毫秒值,转换为天的单位
 * time/1000/60/60/24;
 */
public class DateTest1 {
    public static void main(String[] args) throws ParseException {
        // 1.键盘录入用户的生日(日期字符串)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的生日:xxxx年xx月xx日");
        String birthday = scanner.nextLine();
        // 2.创建SimpleDateFormat对象,指定模式,用于将日期字符串解析为Date日期对象(birthdayDate)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        // 生日那一天的日期对象
        Date birthdayDate = simpleDateFormat.parse(birthday);
        // 3.创建Date日期对象,封装此刻的时间(todayDate)
        Date date = new Date();
        // 4.计算用户活了多少毫秒long time = today.getTime() - birthdayDate.getTime();
        long time = date.getTime()-birthdayDate.getTime();
        // 5.将毫秒值,转换为天的单位
        System.out.println(time/1000/60/60/24);
    }
}
