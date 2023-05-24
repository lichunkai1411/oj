import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-13
 * Time：12:36
 */
public class Text005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();
        int price3 = scanner.nextInt();

        if (price1 < 0 || price2 < 0 || price3 < 0) {
            System.out.println("error");
            return;
        }

        double averagePrice = (price1 + price2 + price3) / 3.0;

        if (averagePrice <= 5) {
            System.out.println("平价");
        } else if (averagePrice > 5 && averagePrice <= 8) {
            System.out.println("有点贵");
        } else if (averagePrice > 8) {
            System.out.println("饮料刺客");
        } else {
            System.out.println("error");
        }
    }
}
