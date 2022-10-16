import java.util.Scanner;

public class Text1057 {
    // 两数间数字之和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 接收两个整数保存到a b 中
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 定义sun等于0
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}