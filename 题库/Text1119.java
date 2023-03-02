import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-15 14:01
 */
public class Text1119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = new String(input.nextLine());
        String str2 = new String(input.nextLine());
        String[] sz1 = str1.split(" ");
        String[] sz2 = str2.split(" ");
        boolean contains = false;
        for (int i = 0; i < sz1.length; i++) {
            for (int j = 0; j < sz2.length; j++) {
                if (sz1[i].length() > sz2[j].length()) {
                    if (sz1[i].contains(sz2[j])) {
                        contains = true;
                        break;
                    }
                } else if (sz1[i].length() < sz2[j].length()) {
                    if (sz2[j].contains(sz1[i])) {
                        contains = true;
                        break;
                    }
                } else {
                    if (sz2[j].contains(sz1[i])) {
                        contains = true;
                        break;
                    }
                }
            }
            if (contains) {
                break;
            }
        }
        System.out.println(contains);
    }
}