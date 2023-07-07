import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-07-04
 * Time：15:32
 */
public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();

        String output = rotateString(input, n);

        System.out.println(output);
    }

    public static String rotateString(String input, int n) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        int len = input.length();
        n = n % len;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < n + len; i++) {
            stringBuilder.append(input.charAt(i % len));
        }

        return stringBuilder.toString();
    }
}
