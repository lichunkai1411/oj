import java.util.Scanner;

public class Text19 {
    //        判断象限
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        // 否则输出"no"
        if (d1 > 0 && d2 > 0) {
            // 如果两个值都大于0
            System.out.println("1");
            // 打印"1"
        } else if (d1 < 0 && d2 > 0) {
            // 否则如果第一个值小于0第二个值大于0
            System.out.println("2");
            // 打印"2"
        } else if (d1 > 0 && d2 < 0) {
            // 否则如果第一个值大于0第二个值小于0
            System.out.println("4");
            // 打印"4"
        } else if (d1 < 0 && d2 < 0) {
            // 否则如果两个值都小于0
            System.out.println("3");
            // 打印"3"
        } else {
            // 否则
            System.out.println("error");
            // 输出"error"
        }
    }
}
