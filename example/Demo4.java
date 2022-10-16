import java.util.Scanner;

public class Demo4 {
    // 数字排序2.0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b) {
            if (b >= c) {
                System.out.println(a + "---" + b + "---" + c);
            } else if (c >= b) {
                if (c >= a) {
                    System.out.println(c + "---" + a + "---" + b);
                } else if (a >= c) {
                    System.out.println(a + "---" + c + "---" + b);
                }
            } else if (b >= a) {
                if (a >= c) {
                    System.out.println(b + "---" + a + "---" + c);
                } else if (c >= a) {
                    if (b >= c) {
                        System.out.println(b + "---" + c + "---" + a);
                    } else if (c >= b) {
                        System.out.println(c + "---" + b + "---" + a);
                    }
                }
            }
        }
    }
}
