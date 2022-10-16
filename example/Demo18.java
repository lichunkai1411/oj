import java.util.Scanner;

public class Demo18 {
    // 最大值最小值问题
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        // int min = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("请输入第" + i + "个数");
            int num = scanner.nextInt();
            if (i == 1) {
                max = num;
            }
            if (num > max)
                max = num;
            i++;
        }
        System.out.println("最大值为" + max);
    }
}