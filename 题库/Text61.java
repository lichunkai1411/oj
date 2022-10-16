import java.util.Scanner;

public class Text61 {
    // "假"的服务器
    public static void main(String[] args) {
        // 将Scanner实例化
        Scanner input = new Scanner(System.in);
        // 接收用户输入的两个字符串
        String a = input.next();
        String b = input.next();
        // .equals比较字符串中所包含的内容是否相同。
        // 如果相同
        if (a.equals("张三") && b.equals("12345")) {
            // 输出打印登陆成功！用户张三
            System.out.println("登陆成功！用户张三");
            // 否则如果相同
        } else if (a.equals("李四") && b.equals("66666")) {
            // 输出打印登陆成功！用户李四
            System.out.println("登陆成功！用户李四");
            // 否则如果不同
        } else if (a.equals("张三") && !b.equals("12345")) {
            // 输出打印密码错误，请重试！
            System.out.println("密码错误，请重试！");
            // 否则如果不同
        } else if (a.equals("李四") && !b.equals("66666")) {
            // 密码错误，请重试！
            System.out.println("密码错误，请重试！");
            // 否则
        } else {
            // 输出打印用户" + a + "不在数据库中，正在尝试自动注册中...\n" +"用户" + a + "注册完成！
            System.out.print("用户" + a + "不在数据库中，正在尝试自动注册中...\n" +
                    "用户" + a + "注册完成！");
        }
    }
}