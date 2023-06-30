import java.util.Scanner;

public class RepeatedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                boolean flag = true;
                for (int j = i; j < n; j++) {
                    if (str.charAt(j) != str.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}

