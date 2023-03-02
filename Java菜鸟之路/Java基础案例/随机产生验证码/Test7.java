package Java基础案例.随机产生验证码;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-28
 * Time：13:45
 *
 * @author lck
 */
public class Test7 {
    public static void main(String[] args) {
        char[] chs = getContents();

        String checkCode = getCheckCode(chs);
        System.out.println("产生的验证码为：" + checkCode);
    }

    private static String getCheckCode(char[] chs) {
        Random random = new Random();
        String checkCode = "";
        for (int i = 1; i <= 5; i++) {
            int randomIndex = random.nextInt(chs.length);
            checkCode += chs[randomIndex];
        }
        return checkCode;
    }

    private static char[] getContents() {
        char[] chs = new char[26 + 26 + 10];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[index]=c;
            index++;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index]=c;
            index++;
        }
        for (char c = '0'; c <= '9'; c++) {
            chs[index]=c;
            index++;
        }
        return chs;
    }
}
