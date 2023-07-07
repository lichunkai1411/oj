import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-07-04
 * Time：15:26
 */
public class Test016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = removeSpaces(input);

        System.out.println(output);
    }

    public static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");
    }
}
