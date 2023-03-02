package 控制语句.ForDemo;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-25
 * Time：20:59
 *
 * @author lck
 */
public class ForDemo {
    public static void main(String[] args) {
        print99();
    }

    public static void forTest() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i +"="+j*i+ "\t");
            }
            System.out.println();
        }
    }
}
