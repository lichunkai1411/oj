import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-23
 * Time：12:41
 */
public class catAndMouse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c') {
                for (int j = i + 1; j < i + 4 && j < input.length(); j++) {
                    if (input.charAt(j) == 'r') {
                        flag = true;
                        break;
                    }
                    if (input.charAt(j) == 'd') {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


