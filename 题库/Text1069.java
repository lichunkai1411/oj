import java.util.Scanner;

public class Text1069 {
    // 几位数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp = a;
        int sum = 0;
        if (a > 0) {
            while (temp > 0) {
                temp = temp / 10;
                sum++;
            }
        } else {
            temp = temp * -1;
            while (temp > 0) {
                temp = temp / 10;
                sum++;
            }
        }
        System.out.println(sum);
    }
}