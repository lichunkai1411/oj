import java.util.Scanner;

public class Text29 {
    // 做个客服
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 读取用户输入的是否为预约；是否为大额业务；
        boolean reserve = input.nextBoolean();
        boolean bigBusiness = input.nextBoolean();
        // 接收用户输入权限
        int permission = input.nextInt();
        // 如果用户没有预约或者预约的不是大额业务
        if (!reserve || !bigBusiness) {
            // 输出"Please make an appointment for large business"
            System.out.println("Please make an appointment for large business");
            // 否则
        } else {
            // 如果权限等于0
            if (permission == 0) {
                // 输出"welcome"
                System.out.println("welcome");
                // 否则
            } else {
                // 输出"You don't have permission"
                System.out.println("You don't have permission");
            }
        }

    }
}