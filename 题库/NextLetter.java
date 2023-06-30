import java.util.Scanner;

public class NextLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 1) % 26);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
