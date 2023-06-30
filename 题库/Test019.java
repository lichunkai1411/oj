import java.util.Scanner;

public class Test019 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse(); // 反转字符串
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                if (Character.isUpperCase(c)) {
                    sb.setCharAt(i, Character.toLowerCase(c)); // 大写转小写
                } else if (Character.isLowerCase(c)) {
                    sb.setCharAt(i, Character.toUpperCase(c)); // 小写转大写
                }
            }
            System.out.println(sb.toString());
        }
    }
