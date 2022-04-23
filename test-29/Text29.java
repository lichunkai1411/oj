import java.util.Scanner;

public class Text29 {
    // 做个客服
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        boolean reserve = enter.nextBoolean();
        boolean bigbusiness = enter.nextBoolean();
        // 读取用户输入的是否为预约；是否为大额业务；
        int permission = enter.nextInt();
        // 接收用户输入权限
        if (!reserve || !bigbusiness) {
            // 如果用户没有预约或者预约的不是大额业务
            System.out.println("Please make an appointment for large business");
            // 输出"Please make an appointment for large business"
        } else {
            // 否则
            if (permission == 0) {
                // 如果权限等于0
                System.out.println("welcome");
                // 输出"welcome"
            } else {
                // 否则
                System.out.println("You don't have permission");
                // 输出"You don't have permission"
            }
        }

    }
}