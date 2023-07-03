import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 输入要找出的好运号码的范围上限
        List<Integer> luckyNumbers = findLuckyNumbers(N);
        for (int num : luckyNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> findLuckyNumbers(int N) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (isLuckyNumber(i)) {
                luckyNumbers.add(i);
            }
        }
        return luckyNumbers;
    }

    public static boolean isLuckyNumber(int num) {
        int sumOfDigits = getSumOfDigits(num);
        double sqrt = Math.sqrt(num);
        int integerPart = (int) sqrt;
        return sumOfDigits == integerPart;
    }

    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
