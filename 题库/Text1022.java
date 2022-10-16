import java.util.Scanner;

public class Text1022 {
    // 正方形面积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 读取用户输入的边长
        int side = input.nextInt();
        // 正方形边长公式为边长平方
        // 输出打印边长平方
        // 需要强制类型转换
        System.out.println((int) Math.pow(side,2));
    }
}
