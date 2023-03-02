package 时间API.JDK8之前.calendar;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：11:35
 */

import java.util.Calendar;

/**
 * Calendar:代表的是系统此刻时间对应的日历,通过它可以单独获取,修改时间中的年月日时分秒等
 * 1.创建对象:
 * public static Calendar getInstance():获取当前时间的日历对象
 * 2.常用方法:
 * public int get(int field):取日历中的某个字段信息
 * get方法的参数:Calendar类中的静态常量
 * Calendar.YEAR:获取年份信息
 * Calendar.MONDAY:获取月份信息 注意Calendar类的月份是0-11,想要获取常规的月份,需要对结果+1操作
 * Calendar.DAY_OF_MONTH:获取日信息
 * Calendar.DAY_OF_WEEK:获取信息信息,获取星期的时候,需要提前设计一个字符数组便于操作 char[]weeks = {' ','日','一','二','三','四','五','六'};
 * Calendar.DAY_OF_YEAR:获取一年中的第几天
 * public void set(int field,int Value):修改日历的某个字段信息
 * public void add(int field,int amount):为某个字段添加/减少指定的值
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-5);
        System.out.println(calendar.get(Calendar.YEAR));
    }

    private static void setMethod() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2022);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(2008,8,8);
        System.out.println(calendar.get(Calendar.YEAR));
    }

    private static void getMethod() {
        // Calendar calendar抽象类
        // Calendar.getInstance():获取的是子类对象
        Calendar calendar = Calendar.getInstance();
        // 2.调用get方法,获取指定字段的信息
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        // 注意Calendar类的月份是0-11,想要获取常规的月份,需要对结果+1操作
        int month = calendar.get(Calendar.MONDAY);
        System.out.println(month+1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        // 星期:日 一 二 三 四 五 六
        //      1  2  3  4 5  6  7
        char[]weeks = {' ','日','一','二','三','四','五','六'};
        int weekIndex = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeks[weekIndex]);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    }
}
