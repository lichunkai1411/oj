package 牛客语法题库;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // 长度为3
        for (int i = 0; i < 3; i++) {
            // 宽度为3
            for (int j = 0; j < 3; j++) {
                System.out.printf(str);
            }
            System.out.println();
        }
    }
}
