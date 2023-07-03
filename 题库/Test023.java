import java.util.Scanner;

public class Test023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 输入要找出的反转数的范围上限
        for (int i = 1; i <= N; i++) {
            if (isReversibleNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isReversibleNumber(int num) {
        int reversedNum = reverseNumber(num);
        return num == reversedNum;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
