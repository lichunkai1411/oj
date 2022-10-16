import java.util.Locale;
import java.util.Scanner;
public class Exe35 {
    // TODO：改变大小写
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String s1 = "abcd";
        String s2 = s1.toUpperCase(Locale.ROOT);
        System.out.println(s2);
    }
}
