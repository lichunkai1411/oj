import java.util.Scanner;

public class Text1038 {
    // 是瑞年吗
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入的年份
        int year = input.nextInt();
        // 进入if循环
        // 判断是否为闰年(能被4整除且不能被100整除，或者能被400整除的为闰年)
        // 如果年份小于0
        if (year < 0) {
            // 输出打印error
            System.out.println("error");
            // 否则如果年份(能被4整除且不能被100整除，或者能被400整除的为闰年)
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // 输出打印yes
            System.out.println("yes");
            // 否则
        } else {
            // 输出打印no
            System.out.println("no");
        }
    }
}
