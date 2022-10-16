import java.util.Scanner;

public class Text1080 {
    // 完数（一）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("error");
        } else {
            fun(a);
        }

    }

    public static void fun(int a) {
        int factor = 0;
        for (int j = 1; j < a / 2 + 1; j++) {
            if (a % j == 0)
                factor += j;
        }
        if (factor == a) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}