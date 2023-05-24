import java.util.Scanner;

public class CatAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int a = s.indexOf('c', 0);
        int b = s.indexOf('r', 0);

        if (b - a > 3) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}