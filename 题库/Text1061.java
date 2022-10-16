public class Text1061 {
    // 四叶玫瑰数
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            int d = i / 1000;

            int sum = a * a * a * a + b * b * b * b + c * c * c * c + d * d * d * d;
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}