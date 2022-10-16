import java.util.Scanner;

public class Text2 {
    // 整数边长矩形的面积
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        // 输入两个值（长宽）
        int a = input.nextInt();
        int b = input.nextInt();
        // 如果有一条边小于0
        if(a < 1  || b < 1) {
            // 输出error
            System.out.println("error");
            // 否则
        } else {
            // 输出a*b
            System.out.println(a * b);
        }
    }
}