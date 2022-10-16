import java.util.Scanner;

public class Text1039 {
    // 是三角形吗
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的三条边
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        // 进入if循环
        // 判断是否为三角形（三角形的两边之和大于第三边）
        // 如果有边长小于0
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            // 输出打印error
            System.out.println("error");
            // 否则如果两边之和大于第三边
        } else if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            // 输出打印yes
            System.out.println("yes");
            // 否则
        } else {
            // 输出打印no
            System.out.println("no");
        }
    }
}
