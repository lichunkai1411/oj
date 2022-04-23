import java.util.Scanner;

public class Text2 {
    // 整数边长矩形的面积
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        // 输入两个值（长宽）
        if (a < 1 || b < 1) {
            // 如果有一条边小于0
            System.out.println("error");
            // 输出error
        } else {
            // 否则
            System.out.println(a * b);
            // 输出a*b
        }
    }
}