import java.util.Scanner;

public class Text13 {
    // 整除问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // 读取用户输入
        if (d < 10 && d % 2 != 0 && d % 3 != 0) {
            // 如果小于10并且不能被2和3整除
            System.out.println("yes");
            // 输出"yes"
        } else {
            // 否则
            System.out.println("no");
            // 输出"no"
        }

    }
}