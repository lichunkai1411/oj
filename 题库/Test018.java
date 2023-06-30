import java.util.Scanner;
import java.util.Arrays;
public class Test018 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] nums = new int[13];
            for (int i = 0; i < 13; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            for (int i = 0; i < 13; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
