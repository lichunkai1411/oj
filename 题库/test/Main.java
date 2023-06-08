package test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-06-08
 * Time：11:50
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else {
                    boolean b = str.charAt(i) == str.charAt(j);
                    if (len == 2) {
                        dp[i][j] = b;
                    } else {
                        dp[i][j] = (b && dp[i + 1][j - 1]);
                    }
                }
                if (dp[i][j] && len > res.length()) {
                    res = str.substring(i, j + 1);
                }
            }
        }
        System.out.println(res);
    }
}


