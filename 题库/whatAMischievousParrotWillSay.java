import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-12-05 13:26
 */
public class whatAMischievousParrotWillSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        System.out.println(s[s.length-1]);

    }
}
