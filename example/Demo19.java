import java.util.Scanner;

public class Demo19 {
    // 最小值问题
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("请输入第" + i + "个数");
            int num = scanner.nextInt();
            if (i == 1) {
                min = num;
            }
            if (num < min)
                min = num;
                i++;
            }
            System.out.println("最小值为" + min);
        }
    }

