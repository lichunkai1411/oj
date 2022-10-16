import java.util.Scanner;
public class Text1051 {
    // 打印奇数
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        // 接收两个整数保存到a b中
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 如果a对10取余并且b对10取余等于0
        if (a % 10 == 0 && b % 10 == 0 ) {
            while (a < b) {
                b--;
                // 如果b不等于a
                if (b!=a) {
                    // 如果b对2取余不等于0
                    if (b % 2 != 0) {
                        System.out.println(b);
                    }
                }
            }
        }
    }
}