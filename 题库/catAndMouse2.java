import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-12-05 13:27
 */
public class catAndMouse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int a = s.indexOf('c', 0);
        int b = s.indexOf('r', 0);
        int d = s.indexOf('d', 0);

        if ((d < a || d > b) && (b - a < 4)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
