import java.util.Scanner;

public class Text17 {
    // 判断大小
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        // 读取用户输入的两个值
        if (a > b) {
            // 如果前一个大于后一个
            System.out.println(a);
            // 打印前一个值
        } else if (b > a) {
            // 否则如果后一个大于前一个
            System.out.println(b);
            // 打印后一个值
        } else {
            // 否则
            System.out.println(a);
            // 打印任意一个数
        }
    }
}