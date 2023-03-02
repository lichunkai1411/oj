import java.util.Scanner;

public class Text10for {
    // TODO：把while循环替换为do while 和 for循环
    // 输入三个数求最大值
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        // 三个数
        for (int i = 1; i < 4; i++) {
            int num = input.nextInt();
            if (i == 1) {
                max = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}