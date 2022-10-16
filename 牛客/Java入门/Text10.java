package Java入门;

import java.util.Scanner;

public class Text10 {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            int num = input.nextInt();
            if (num<=0)break;
            else count++;
        }
        System.out.println(count);
    }
}
