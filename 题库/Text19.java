import java.util.Scanner;

public class Text19 {
    // 判断象限
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 接收一个坐标
        double X = input.nextDouble();
        double Y = input.nextDouble();
        // 如果两个值都大于0
        if (X > 0 && Y > 0) {
            // 打印"1"
            System.out.println("1");
            // 否则如果第一个值小于0第二个值大于0
        } else if (X < 0 && Y > 0) {
            // 打印"2"
            System.out.println("2");
            // 否则如果第一个值大于0第二个值小于0
        } else if (X > 0 && Y < 0) {
            // 打印"4"
            System.out.println("4");
            // 否则如果两个值都小于0
        } else if (X < 0 && Y < 0) {
            // 打印"3"
            System.out.println("3");
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }
    }
}
