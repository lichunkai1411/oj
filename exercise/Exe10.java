import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        do {
            System.out.println(count);
            count = count - 1;
            System.out.println("发射！");
        } while (count > 0);
    }
}
