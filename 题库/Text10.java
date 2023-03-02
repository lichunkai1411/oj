import java.util.Scanner;

public class Text10 {
    // TODO：把while循环替换为do while 和 for循环
    // 输入三个数求最大值
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 导入一个数
        int max = 0;
        // 接收的第一个数
        int i = 1;
        // 三个数
        while (i <= 3) {
            // 将第一个输入的值为最大值
            int num = input.nextInt();
            // 如果i等于1
            if (i == 1) {
                max = num;
            }
            // 剩余的数与第一个比较
            if (num > max) {
                max = num;
            }
            // 后续递增
            i++;
        }
        // 输出这个最大数
        System.out.println(max);

    }
}