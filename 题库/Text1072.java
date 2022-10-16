import java.util.Scanner;

public class Text1072 {
    // 找质数（二）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 3) {
            for (int i = 3; i < a; i++)
                if (i % 2 == 0) {
                } else {
                    boolean flag = false;
                    for (int j = 2; j <= i - 1; j++) {
                        if (i % j == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println(i);
                    }
                }
        } else {
            System.out.println("error");
        }

    }
}