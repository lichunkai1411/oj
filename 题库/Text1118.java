import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-15 14:44
 */
public class Text1118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.println(str1.startsWith(str2));
    }
}
