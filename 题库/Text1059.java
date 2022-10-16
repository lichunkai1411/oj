public class Text1059 {
    // 水仙花数(二)
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i / 100;
            int y = i / 10 % 10;
            int z = i % 10;
            if (i == x * x * x + y * y * y + z * z * z)
                System.out.println(i);
        }

    }
}