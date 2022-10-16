import java.util.Scanner;

public class Text1026 {
    // 半圆周长
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入直径
        int diameter = input.nextInt();
        // 半圆公式为C=PIr+2r
        System.out.println(diameter / 2 * 3.14);
    }
}
