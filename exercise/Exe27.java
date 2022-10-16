import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]num = {87,98,65,54,43,63,243,56,24,76,42,56};
        System.out.println(num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
