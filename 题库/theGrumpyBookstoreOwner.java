import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-23
 * Time：13:18
 */
public class theGrumpyBookstoreOwner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numCustomers = new int[5];
            for (int i = 0; i < 5; i++) {
                numCustomers[i] = scanner.nextInt();
            }
            int X = scanner.nextInt();
            int totalGoodReviews = maxNumGoodReviews(X, numCustomers);
            System.out.println(totalGoodReviews);
        }

        public static int maxNumGoodReviews(int X, int[] numCustomers) {
            // 如果X大于5，或者numCustomers的长度不是5，则输出“error
            if (X > 5 || numCustomers.length != 5) {
                return -1;
            }

            // 初始化好评总数为0
            int totalGoodReviews = 0;
            // 遍历所有天数
            for (int i = 0; i < 5; i++) {
                // 如果i<X，则所有当天来的顾客都会给书店好评
                if (i < X) {
                    totalGoodReviews += numCustomers[i];
                }
            }
            // 返回好评总数
            return totalGoodReviews;
        }
    }




