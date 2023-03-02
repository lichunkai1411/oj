package 面向对象.oop.String.test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2023-01-31
 * Time：14:19
 *
 * @author lck
 */
public class StringTest1 {
    /**
     * 需求：模拟用户登录，一共上次机会，登录之后要给出相应提示
     * <p>
     * 分析：
     * 1.定义两个字符串类型变量，模拟已经存在的用户名和密码
     * 2.键盘录入用户输入的用户名和密码
     * 3.比对
     *
     * @param args
     */
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String inputUsername = scanner.nextLine();
            System.out.println("请输入密码：");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("明个再来吧~");
                } else {
                    System.out.println("登录失败,您还剩余" + (3 - i) + "次机会");
                }
            }
        }
    }
}
