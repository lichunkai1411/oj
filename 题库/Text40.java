import java.util.Scanner;
public class Text40 {
    // 存钱算利息
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 读取用户输入的金额
        double money=scan.nextInt();
        // 如果金额小于0
        if (money<0){
            // 输出打印error
            System.out.println("error");
            // 否则
        }else {
            // 进入for循环
            for (int i=1;i<=5;i++){
                // 本金等于金额+金额乘0.003
                money=money+money*0.003;
            }
            // 输出打印本金
            System.out.println(money);
        }
    }
}