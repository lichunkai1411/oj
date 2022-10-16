public class Text1071 {
    // 找质数（一）
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            if (i % 2 == 0) {
            } else {
                boolean flag = false;
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(i);
                }
            }
        }

    }
}