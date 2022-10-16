public class Text48 {
    // 跳五求和
    public static void main(String[] args) {
        // 定义sum初始化为0
        int sum = 0;
        // 进入for循环从1至100后续递增
        for (int i = 1; i <= 100; i++) {
            // 如果不能被5整除
            if (i % 5 != 0) {
                // 累计求和；将不能整除的相加
                sum += i;
            }
        }
        // 输出sum
        System.out.println(sum);
    }
}