import java.util.Scanner;

public class Test020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // 输入字符串
        int k = scanner.nextInt(); // 子串长度
        String reversedString = reverseSubstring(s, k);
        System.out.println(reversedString);
    }

    public static String reverseSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
