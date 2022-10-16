import java.util.Scanner;

public class Text1050 {
    // 打印偶数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 接收两个数保存到a b中
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b) {
            a++;
            //如果对2取余等于0并且a不等于b
            if (a % 2 == 0 && a != b) {
                System.out.println(a);
            }
        }
    }
}