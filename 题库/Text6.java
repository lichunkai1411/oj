import java.util.Scanner;

public class Text6 {
    // 整数边长三角形的面积
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 输入三角形底边长度和高
        double high = input.nextDouble();
        double bottom = input.nextDouble();
        // 如果高和底边都大于0
        if (high > 0 && bottom > 0) {
            // 输出底乘高除以二
            System.out.println(high * bottom / 2);
            // 否则
        } else {
            // 输出"error"
            System.out.println("error");
        }

    }
}