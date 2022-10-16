import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <=num ; i++) {
            sum+=1.0/i;
        }
        System.out.printf("%.2f",sum);
    }
}
