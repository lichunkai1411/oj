import java.util.Scanner;

public class Text34 {
    // 每月有多少天
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 接收月份
        int month = input.nextInt();
        // 进入switch循环
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // 是1.3.5.7.8.10.12月输出打印31
                System.out.println(31);
                // 执行完满足case条件的内容内后结束switch
                break;
            // 读取用户输入的月份是1，3，5，7，8，10，12输出31结束
            case 2:
                // 是2月输出打印28
                System.out.println(28);
                // 执行完满足case条件的内容内后结束switch
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // 是4.6.9.11月输出打印30
                System.out.println(30);
                // 执行完满足case条件的内容内后结束switch
                break;
                // 如果case没有匹配的值
            default:
                // 输出打印error
                System.out.println("error");
                // 执行完满足case条件的内容内后结束switch
                break;
        }
    }
}