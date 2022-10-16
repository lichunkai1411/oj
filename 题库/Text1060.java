import java.util.Scanner;

public class Text1060 {
    // 四叶玫瑰花
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 1000 || x > 9999) {
            System.out.println("error");
        } else {
            int a = x % 10;
            int b = x / 10 % 10;
            int c = x / 100 % 10;
            int d = x / 1000;
            int sum = a * a * a * a + b * b * b * b + c * c * c * c + d * d * d * d;
            if (sum == x) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }


        }
    }
}