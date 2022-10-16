import java.util.Scanner;

public class Text1042 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // 定义max初始值为0
        int max=0;
        // 定义i初始值为1
        int i=1;
        // 三个数
        while (i<=3) {
            int num = input.nextInt();
        // 将第一个输入的值为最大值
            if (i == 1) {
                max = num;
            }
        // 剩余的数与第一个比较
            if (num > max) {
                max=num;
            }
            // i递增
            i++;
        }
        // 输出打印max
        System.out.println(max);
    }
}