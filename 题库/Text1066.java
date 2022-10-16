import java.util.Scanner;

public class Text1066 {
    // 最大公约数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = getMaxCommonDivisor(a, b);

        System.out.print(m);
    }

    private static int getMaxCommonDivisor(int a, int b) {
        // 使a小,b大
        if (a > b) {
            // 两个数交换
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int temp = a;
        while (temp > 0) {
            if (a % temp == 0 && b % temp == 0) {
                break;
            }
            temp--;
        }
        return temp;
    }

}