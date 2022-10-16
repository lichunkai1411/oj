import java.util.Scanner;

public class Text14 {
    // 判断瑞年
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的值
        int year = input.nextInt();
        // 如果该年份能被4整除且不能被100整除或者能被400整除
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // 输出"runnian"
            System.out.println("runnian");
            // 否则如果该年份小于0
        } else if (year < 0) {
            // 输出"error"
            System.out.println("error");
            // 否则
        } else {
            // 输出"bushirunnian"
            System.out.println("bushirunnian");
        }
    }
}