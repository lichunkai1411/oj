package 控制语句;

/**
 * 计算100之内的累加和、所有奇数和、所有偶数和
 */
public class Sum100 {
    public static void main(String[] args) {
        // 累加和
        int sum = 0;  // 总和
        int oddSum = 0; // 奇数和
        int evenSum = 0; // 偶数和
        for (int i = 0; i <= 100; i++) {
            sum += i; // sum = sum + i;
            if (i%2 == 0) {
                evenSum += i;
            }else {
                oddSum += i;
            }
        }
        System.out.println("100之内数字的累加和" + sum);
        System.out.println("100之内所有奇数和" + oddSum);
        System.out.println("100之内所有偶数和" + evenSum);
    }
}
