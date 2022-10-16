import java.util.Scanner;

public class Text1025 {
    // 三角形面积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的底边长和高
        int bottom = input.nextInt();
        int high = input.nextInt();
        // 三角形面积公式为底乘高除2
        System.out.println(bottom*high/2);
    }
}
