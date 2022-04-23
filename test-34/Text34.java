import java.util.Scanner;

public class Text34 {
    // 每月有多少天
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            // 读取用户输入的月份是1，3，5，7，8，10，12输出31结束
            case 2:
                System.out.println(28);
                break;
            // 是2月份输出28 结束
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            // 月份是4，6，9，11输出30
            default:
                System.out.println("error");
                break;
            // 输出"error"
        }
        System.out.println("*****");
    }
}