import java.util.Scanner;

public class Text1064 {
    // 求平均值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double sum = 0;
        if (m <= 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i < m; i++) {
                double temp = scanner.nextDouble();
                sum += temp;
            }
            System.out.println(sum / m);
        }
    }
}