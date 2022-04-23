public class Text48 {
    // 跳五求和
    public static void main(String[] args) {
        int sum = 0;
        // 定义sum初始化为0
        for (int i = 1; i <= 100; i++) {
            // 进入for循环从1至100后续递增
            if (i % 5 != 0) {
                // 如果不能被5整除
                sum += i;
                // 累计求和；将不能整除的相加
            }
        }
        System.out.println(sum);
        // 输出sum
    }
}