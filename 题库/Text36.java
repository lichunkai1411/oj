import java.util.Scanner;

public class Text36 {
    // 检查螺丝钉
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        double length = enter.nextDouble() - 3.5;
        // 用用户输入的长度减去标准长度
        if (length <= 0.01 && length >= -0.01) {
            // 如果剩余长度小于等于0.01并且大于等于-0.01
            System.out.println("hege");
            // 输出"hege"
        } else {
            // 否则
            System.out.println("buhege");
            // 输出"buhege"
        }

    }
}