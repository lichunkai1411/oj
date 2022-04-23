import java.util.Scanner;

public class Text35 {
    // 判断元音
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        char vowel = enter.next().toLowerCase().charAt(0);
        // 导入char类型;将字符串转化为小写；序列的第一个char值是在索引为0；
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            // 如果元音等于a或者e或者i或者o或者u
            System.out.println("yes");
            // 输出"yes"
        } else {
            // 否则
            System.out.println("no");
            // 输出"no"
        }
    }
}