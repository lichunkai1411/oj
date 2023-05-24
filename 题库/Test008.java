import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-05-13
 * Time：11:37
 */
public class Test008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("error");
        }
    }
}
