import java.util.Scanner;
public class Text27 {
    // 判断立方体
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        double side1 = enter.nextDouble();
        double side2 = enter.nextDouble();
        double side3 = enter.nextDouble();
        // 读取用户输入的三条边长
        if (side1 == side2 && side2 == side3) {
            System.out.println("yes");
            // 如果三条边相等输出"yes"
        } else {
            System.out.println("no");
            // 否则输出"no"
        }
    }
}
