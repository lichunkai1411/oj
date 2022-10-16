import java.util.Scanner;
public class Text27 {
    // 判断立方体
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的三条边长
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        // 如果三条边相等
        if (side1 == side2 && side2 == side3) {
            // 输出"yes"
            System.out.println("yes");
            // 否则
        } else {
            // 输出"no"
            System.out.println("no");
        }
    }
}
