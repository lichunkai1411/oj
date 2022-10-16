import java.util.Scanner;

public class Text1070 {
    // 找零
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 48) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
