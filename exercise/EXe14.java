import java.util.Scanner;

public class EXe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factor = 1;
        for (int i = 1; i <=num ; i++) {
            factor=factor*i;
        }
        System.out.println(factor);
    }
}
