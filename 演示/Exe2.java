import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        double foot;
        double inch;
        Scanner input = new Scanner(System.in);
        foot = input.nextDouble();
        inch = input.nextDouble();
        double meter = (foot + inch / 12) * 0.3048 * 100;
        System.out.println((int) meter + "cm");
    }
}
