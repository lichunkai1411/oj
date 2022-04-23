import java.util.Scanner;

public class Text20 {
    // 判断三角形
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        // 读取用户输入的三条边
        if (x + y > z && x + z > y && z + y > x) {
            // 勾股定理（两边之和大于第三边）
            System.out.println("yes");
            // 输出"yes"
        } else {
            // 否则
            System.out.println("no");
            // 输出"no"
        }

    }
}
