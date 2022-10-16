import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        a[0] = 5;
        int[] b = a;
        b[0] = 16;
        System.out.println(a[0]);
    }
}
