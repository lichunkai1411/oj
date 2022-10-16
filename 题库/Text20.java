import java.util.Scanner;

public class Text20 {
    // 判断三角形
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的三条边
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        // 勾股定理（两边之和大于第三边）
        if (x + y > z && x + z > y && z + y > x) {
            // 输出"yes"
            System.out.println("yes");
            // 否则
        } else {
            // 输出"no"
            System.out.println("no");
        }
    }
}
