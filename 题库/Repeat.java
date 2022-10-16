import java.util.Scanner;

public class Repeat {
    // 寻找重复数
    public static int findDuplicate(int[] nums) {
        // n+1=len,n=len-1
        int len = nums.length;
        // 在数组中查找重复的元素
        int left = 1;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // nums中小于等于mid的个数
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            // 搜索区间为left……mid
            if (count > mid) {
                right = mid;
            } else {
                // 搜索区间为mid……right
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int ret = findDuplicate(a);
        System.out.println(ret);
    }
}