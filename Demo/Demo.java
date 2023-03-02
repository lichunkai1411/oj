import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-21 22:14
 */
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max = 0;
        int min = 0;
        int i = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;

            while (min <= max) {
                i = 2;
                while (i < min) {
                    if (min % i == 0) {
                        break;
                    } else {
                        i = i + 1;
                    }
                    if (i == min) {
                        System.out.println(min);
                        min += 1;
                    }
                }
            }
        }
    }
}
