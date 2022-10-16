import java.util.Scanner;

public class Text1067 {
    // 将数反过来
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp = a;
        if (a == 0) {
            System.out.println(a);
        } else {
            if (a >= 0) {
                while (temp > 0) {
                    a = temp % 10;
                    temp = temp / 10;
                    System.out.print(a);
                }
            } else {
                StringBuilder w = new StringBuilder("-");
                temp = temp * -1;
                while (temp > 0) {
                    a = temp % 10;
                    temp = temp / 10;
                    w.append(a);
                }
                System.out.println(Integer.parseInt(w.toString()));
            }
        }
    }
}
