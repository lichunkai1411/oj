import java.util.Scanner;
public class Text32 {
    // 今天是星期几
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // 读取用户输入的日期作为第一个变量
        int day1=scan.nextInt();
        // 第一个变量对7取余赋值给第二个变量
        int day2=day1%7;
        // 如果第二个变量为0
        if (day2==0){
            // 则说明这一天为星期日
            System.out.println(7);
            // 否则
        }else {
            // 为第二个变量
            System.out.println(day2);
        }
    }
}