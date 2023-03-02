import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-12-02 10:16
 */
public class primeNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 < num2) {
            for (int i = num1; i < num2 + 1; i++) {
                boolean isPrime = true;
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    if (i >= 2) {
                        System.out.println(i);
                    }
                }
            }
        } else {
            for (int i = num2; i < num1 + 1; i++) {
                boolean isPrime = true;
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    if (i >= 2) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
