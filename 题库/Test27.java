import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-07-04
 * Time：15:31
 */
public class Test27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = removeDuplicates(input);

        System.out.println(output);
    }

    public static String removeDuplicates(String input) {
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charSet.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charSet) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
