import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += k) {
            if (i + k <= str.length()) {
                sb.append(new StringBuilder(str.substring(i, i + k)).reverse());
            } else {
                sb.append(new StringBuilder(str.substring(i)).reverse());
            }
        }
        System.out.println(sb.toString());
    }
}
