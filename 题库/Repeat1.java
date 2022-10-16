import java.util.Arrays;
import java.util.Scanner;

public class Repeat1 {
    // 寻找重复数
    public static int findDuplicate(int [] nums){
        // 记录长度
        int len = nums.length;
        int res = 0;
        // 创建记录数组
        int [] a = new int[len+1];
        // 数组填充
        Arrays.fill(a,0);
        for (int num : nums) {
            a[num] += 1;
        }
        for (int i = 0; i < a.length; i++) {
            // 如果大于1，则直接返回结果
            if (a[i]>1)
                res=i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int res = findDuplicate(a);
        System.out.println(res);
    }
}
