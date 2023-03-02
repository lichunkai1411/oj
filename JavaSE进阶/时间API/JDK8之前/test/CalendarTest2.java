package 时间API.JDK8之前.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：12:21
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 需求:键盘录入一个日期字符串,程序输出这个日期是一年中的第多少天
 * 1.使用SimpleDateFormat,将日期字符串转为日期对象
 * 2.将日期对象,转换为Calendar对象
 * 3.调用get方法,获取一年中的第几天
 */
public class CalendarTest2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        String dateContent = scanner.nextLine();
        // 1.使用SimpleDateFormat,将日期字符串转为日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(dateContent);
        // 2.将日期对象,转换为Calendar对象
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 3.调用get方法,获取一年中的第几天
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("是这一年中的第"+dayOfYear+"天");
    }
}
