import java.util.Scanner;

/**
 * @Author Lick
 * @date Created in 2022-11-30 09:42
 */
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入一个字符串并转换为字符数组
        char[] str = sc.next().toCharArray();
        // 判断字符数组的长度
        if (str.length % 2 == 0){
            if (Judge(str, str.length / 2) == 1){
                System.out.println("True");
            }else System.out.println("False");
        }else{
            if (Judge(str, (str.length + 1) / 2) == 1){
                System.out.println("True");
            }else System.out.println("False");
        }
    }

    // 判断是否是回文字符串
    public static int Judge(char[] a, int n) {
        int i = 0;
        while (i < n) {
            if (a[i] == a[a.length - i - 1])
                i++;
            else return 0;
        }
        return 1;
    }
}
