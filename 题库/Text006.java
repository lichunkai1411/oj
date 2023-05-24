/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-13
 * Time：12:41
 */
public class Text006 {
    public static void main(String[] args) {
        for (double i = 1.5; i < 20; i += 0.5) {
            if (i % 1 == 0) {
                System.out.print((int) i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
