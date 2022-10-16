import java.util.Scanner;

public class Text17 {
    // 判断大小
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的两个值
        int a = input.nextInt();
        int b = input.nextInt();
        // 如果前一个大于后一个
        if (a > b) {
            // 打印前一个值
            System.out.println(a);
            // 否则如果后一个大于前一个
        } else if (b > a) {
            // 打印后一个值
            System.out.println(b);
            // 否则
        } else {
            // 打印任意一个数
            System.out.println(a);
        }
    }
}