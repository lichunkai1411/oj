package 控制语句;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-25
 * Time：11:20
 *
 * @author lck
 */
public class GetSum {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println(sum);
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        return sum;
    }
}
