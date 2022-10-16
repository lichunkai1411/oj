import java.util.Scanner;
    // 判断字符串是否相等
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String pwd = scanner.next();
        if ("张三".equals(name) &&"123456".equals(pwd)){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
