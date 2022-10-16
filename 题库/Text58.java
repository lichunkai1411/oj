import java.util.Scanner;

public class Text58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (num < 1) {
            System.out.println("error");
            return;
        }
        System.out.println(b);
        for (int i = 2; i <= num; i++) {
            // 第三个数的值等于牵两个数的和
            c = a + b;
            // 第二个数的值赋值给第一个数
            a = b;
            // 第三个数的值赋值给第二个数
            b = c;
            System.out.println(c);
        }
    }
}