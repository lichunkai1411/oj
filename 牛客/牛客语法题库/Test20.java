package 牛客语法题库;

import java.util.Scanner;

/**
 * 除法
 */
public class Test20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a/b);
        }
    }
}
