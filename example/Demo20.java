import java.util.Scanner;

public class Demo20 {
    // 最大小值判断
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min =0;
        int i = 1;
        while (i<=10){
            System.out.println("请输入"+i+"第个数");
            int num = scanner.nextInt();
            if (i==1){
                max=num;
                min=num;
            }
            if (num>max) {
                max = num;
            }if (num<min){
                min=num;
            }
            i++;
        }
        System.out.println("最大值为："+max+"最小值为："+min);
    }
}
