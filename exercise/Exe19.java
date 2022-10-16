import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sum = 0.0;
        int sign = 1;
        for (int i = 1; i <=num ; i++,sign=-sign) {
            sum+=sign*1.0/i;
        }
        System.out.printf("%.2f",sum);
    }
}
