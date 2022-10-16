import java.util.Scanner;

public class Text1078 {
    // 打印直角三角形（三）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        if (side < 1) {
            System.out.println("error");
        } else {
            for (int i = 1; i <= side; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}