import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-07-04
 * Time：15:33
 */
public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isValid = isValidParentheses(input);
        System.out.println(isValid);
    }

    public static boolean isValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
