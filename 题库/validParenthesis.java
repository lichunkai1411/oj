import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-25
 * Time：14:38
 */
public class validParenthesis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (isValid(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                if (c == ']' && stack.peek() != '[') {
                    return false;
                }
                if (c == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}


