import java.util.Scanner;

public class Text10124 {
    public static void main(String[] args) {
        // 接受用户输入
        Scanner input = new Scanner(System.in);
        // 长
        int a = input.nextInt();
        // 宽
        int b = input.nextInt();
        // 高
        int c = input.nextInt();
        // 输出表面积
        System.out.println("表面积为：" + 2 * a * b + 2 * b * c + 2 * a * c);
    }
}