import java.util.Scanner;

public class Text1058 {
    // 水仙花数(一)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // 如果小于100或者大于999
        if (num < 100 || num > 999) {
            System.out.println("error");
        } else {
            int x = num / 100;
            int y = num / 10 % 10;
            int z = num % 10;
            if (num == x * x * x + y * y * y + z * z * z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}