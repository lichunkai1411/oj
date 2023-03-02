import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Author：Lick
 * Date Created in 2022-12-23
 * Time：12:15
 */
public class digitalCertificate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String license = input.nextLine();
        String check = input.nextLine();
        int t1 = Integer.valueOf(license.substring(3, 11));
        int t2 = Integer.valueOf(check);
        boolean b = license.substring(0, 3).equals("reg");
        if (b) {
            if (t2 < t1) {
                System.out.println("认证类型：" + license.substring(11));
                System.out.println("认证到期时间：" + license.substring(3, 11));
                System.out.println("认证状态：未过期");
            } else {
                System.out.println("认证类型：" + license.substring(11));
                System.out.println("认证到期时间：" + license.substring(3, 11));
                System.out.println("认证状态：已过期");
            }

        }

    }
}

