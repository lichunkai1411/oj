import java.util.Scanner;

public class Text1027 {
    // 立方体体积
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的边长
        int side = input.nextInt();
        // 立方体体积公式为边长的立方
        System.out.println(Math.pow(side, 3));
    }
}
