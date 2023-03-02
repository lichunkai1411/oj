import java.util.Scanner;

public class Text10dowhile {
    // TODO：把while循环替换为do while 和 for循环
    // 输入三个数求最大值
    /**
    @author
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int max = 0;
        int num = 1;
        do {
            int input = enter.nextInt();
            if (num == 1) {
                max = input;
            }
            if (input > max) {
                max = input;
            }
            num += 1;
            // 三个数
        } while (num < 4);
        System.out.println(max);
    }
}