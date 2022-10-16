import java.util.Scanner;
public class Text59 {
    public static void main(String [] args) {
        Scanner scan  = new Scanner(System.in);
        int x = 36 ;
        while (x < 107) {
            x++;
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}