import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.print("请输入需要几个数字：");
        int cnt = input.nextInt();
        if (cnt > 0) {
            int[] numbers = new int[cnt];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
                sum += numbers[i];
            }
            double average = sum / cnt;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}