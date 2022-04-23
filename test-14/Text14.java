import java.util.Scanner;

public class Text14 {
    // 判断瑞年
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // 读取用户输入的值
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // 如果该年份能被4整除且不能被100整除或者能被400整除
            System.out.println("runnian");
            // 输出"runnian"
        } else if (year < 0) {
            // 否则如果该年份小于0
            System.out.println("error");
            // 输出"error"
        } else {
            // 否则
            System.out.println("bushirunnian");
            // 输出"bushirunnian"
        }
    }
}