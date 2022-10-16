import java.util.Scanner;

public class Demo17 {
    //输入任意10个数求他们的平均值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("请输入第"+i+"个数:");
            int num = scanner.nextInt();
            sum=sum+num;
            i++;
        }
        System.out.println("平均值是："+sum/10.0);
    }
}
