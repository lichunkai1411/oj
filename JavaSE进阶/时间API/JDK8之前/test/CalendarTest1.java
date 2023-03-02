package 时间API.JDK8之前.test;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-02-19
 * Time：12:10
 */

import java.util.Calendar;

/**
 * 需求:使用程序判断出 2050年3月1日 是否是疯狂星期四
 */
public class CalendarTest1 {
    public static void main(String[] args) {
        // 1.获取日期对象(此刻的时间)
        Calendar calendar = Calendar.getInstance();
        // 2.调用set方法,将时间设置为2050年3月1日
        calendar.set(2050,2,1);
        // 3.获取星期
        char []weeks = {' ','日','一','二','三','四','五','六'};
        int weekIndex = calendar.get(Calendar.DAY_OF_WEEK);
        if (weeks[weekIndex] == '四'){
            System.out.println("今天是疯狂星期四,我要奢侈一把~");
        }else {
            System.out.println("今天不是疯狂星期四,吃不起KFC");
        }
    }

}
